package com.esliceu.service;

import com.esliceu.model.Atack;
import com.esliceu.model.Defense;
import com.esliceu.model.Monster;
import com.esliceu.model.Types;

import java.util.Scanner;

public class GameService {
    private Boolean turn = true;
    public void doTurn(Monster first, Monster second) {
        while (first.getHealthPoint() >= 0 || second.getHealthPoint() >= 0) {
            Monster aux;
            Atack selectedAtack = null;
            Defense selectedDefense = null;
            if (!turn) {
                aux = first;
                first = second;
                second = aux;
            }
            System.out.println("Choose Atack:\nPress 1 for fire atack.\nPress 2 for water atack.\nPress 3 for grass atack.");
            Scanner input = new Scanner(System.in);
            ;
            switch (input.nextInt()) {
                case 1:
                    selectedAtack = first.getSelectedAtack(Types.FIRE);
                    selectedAtack.setDebility(Types.WATER);
                    first.setSelectedAtack(selectedAtack);
                    break;
                case 2:
                    selectedAtack = first.getSelectedAtack(Types.WATER);
                    selectedAtack.setDebility(Types.GRASS);
                    first.setSelectedAtack(selectedAtack);
                    break;
                case 3:
                    selectedAtack = first.getSelectedAtack(Types.GRASS);
                    selectedAtack.setDebility(Types.FIRE);
                    first.setSelectedAtack(selectedAtack);
                    break;
                default:
                    System.out.println("No atack selected.");
                    break;
            }
            System.out.println("Choose Defense:\nPress 1 for fire defense.\nPress 2 for water defense.\nPress 3 for grass defense.");
            switch (input.nextInt()) {
                case 1:
                    selectedDefense = second.getSelectedDefense(Types.FIRE);
                    selectedDefense.setDebility(Types.WATER);
                    second.setSelectedDefense(selectedDefense);
                    break;
                case 2:
                    selectedDefense = second.getSelectedDefense(Types.WATER);
                    selectedDefense.setDebility(Types.GRASS);
                    second.setSelectedDefense(selectedDefense);
                    break;
                case 3:
                    selectedDefense = second.getSelectedDefense(Types.GRASS);
                    selectedDefense.setDebility(Types.FIRE);
                    second.setSelectedDefense(selectedDefense);
                    break;
                default:
                    System.out.println("No defense selected.");
                    break;
            }
            assert selectedAtack != null;
            assert selectedDefense != null;
            calculateHealthPoint(second, selectedAtack, selectedDefense);
            turn = false;
        }
    }

    private void calculateHealthPoint(Monster second, Atack atack, Defense defense) {
        int losedPoints;
        if (atack.getDebility().equals(defense.getType())) {
            losedPoints = (atack.getPower() / 2) - (defense.getPower() * 2);
            if (losedPoints > 0) {
                second.setHealthPoint(second.getHealthPoint() - losedPoints);
            }
        } else if (atack.getType().equals(defense.getDebility())) {
            losedPoints = (atack.getPower() * 2) - (defense.getPower() / 2);
            if (losedPoints > 0) {
                second.setHealthPoint(second.getHealthPoint() - losedPoints);
            }
        } else {
            losedPoints = atack.getPower() - defense.getPower();
            if (losedPoints > 0) {
                second.setHealthPoint(second.getHealthPoint() - losedPoints);
            }
        }
        System.out.println(second.getName() + ":\nHP: " + second.getHealthPoint());
    }
}

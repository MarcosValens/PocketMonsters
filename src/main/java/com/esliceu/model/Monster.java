package com.esliceu.model;

import java.util.List;

public class Monster {
    private String name;
    private int healthPoint;
    private List<Atack> atacks;
    private List<Defense>defenses;
    private Atack selectedAtack;
    private Defense selectedDefense;

    public Atack getSelectedAtack(Types type) {
        Atack selected = null;
        for (Atack atack:atacks) {
            if (atack.type.equals(type)){
                selected = atack;
            }
        }
        return selected;
    }


    public void setSelectedAtack(Atack selectedAtack) {
        this.selectedAtack = selectedAtack;
    }

    public Defense getSelectedDefense(Types type) {
        Defense selected = null;
        for (Defense defense:defenses) {
            if (defense.type.equals(type)){
                selected = defense;
            }
        }
        return selected;
    }

    public void setSelectedDefense(Defense selectedDefense) {
        this.selectedDefense = selectedDefense;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public List<Atack> getAtacks() {
        return atacks;
    }

    public void setAtacks(List<Atack> atacks) {
        this.atacks = atacks;
    }

    public List<Defense> getDefenses() {
        return defenses;
    }

    public void setDefenses(List<Defense> defenses) {
        this.defenses = defenses;
    }

    public Monster(String name, int healthPoint) {
        this.name = name;
        this.healthPoint = healthPoint;
    }
}

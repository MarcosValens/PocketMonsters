package com.esliceu.service;

import com.esliceu.model.Atack;
import com.esliceu.model.Defense;
import com.esliceu.model.Monster;
import com.esliceu.model.Types;

import java.util.ArrayList;

public class MonsterService {
    public ArrayList createMonster(){
        ArrayList<Monster>monsters = new ArrayList<Monster>();
        Monster monster1 = new Monster("Monster1",100);
        Monster monster2 = new Monster("Monster2",100);
        Atack fireAtack = new Atack(20, Types.FIRE);
        Atack waterAtack = new Atack(10, Types.WATER);
        Atack grassAtack = new Atack(15, Types.GRASS);
        ArrayList<Atack> atacks = new ArrayList<Atack>();
        atacks.add(fireAtack);
        atacks.add(waterAtack);
        atacks.add(grassAtack);
        Defense fireDefense = new Defense(20,Types.FIRE);
        Defense waterDefense = new Defense(20,Types.WATER);
        Defense grassDefense = new Defense(20,Types.GRASS);
        ArrayList<Defense>defenses = new ArrayList<Defense>();
        defenses.add(fireDefense);
        defenses.add(waterDefense);
        defenses.add(grassDefense);
        monster1.setAtacks(atacks);
        monster2.setAtacks(atacks);
        monster1.setDefenses(defenses);
        monster2.setDefenses(defenses);
        monsters.add(monster1);
        monsters.add(monster2);
        return monsters;
    }

}

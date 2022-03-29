package com.company;


import java.util.ArrayList;
import java.util.Random;

public class Orc extends Race {
    ArrayList<Integer> randome = new ArrayList<>();

    public Orc(int health, int armor, int min_dmg, int max_dmg) {
        super(health, armor, min_dmg, max_dmg);
    }

    @Override
    public boolean Ability(ArrayList<Integer> list) {
        generateAbility();
        return list.get(new Random().nextInt(6)) == 1;
    }

    @Override
    public void TakeDamage(int dmg) {
        health = health - (dmg - armor);
        if (health < 0) {
            health = 0;
        }

    }

    @Override
    public int Attack() {
        if (Ability(randome)) {
            System.out.println("CRIT! Orc deal " + (getMin_dmg() + new Random().nextInt(getMax_dmg() - getMin_dmg() + 1)) * 2 + " dmg");
            return (getMin_dmg() + new Random().nextInt(getMax_dmg() - getMin_dmg() + 1)) * 2;
        } else
            System.out.println("Orc deal " + (getMin_dmg() + new Random().nextInt(getMax_dmg() - getMin_dmg() + 1)) + " dmg");
        return (getMin_dmg() + new Random().nextInt(getMax_dmg() - getMin_dmg() + 1));
    }

    public void currentHealth() {
        if(health < 0){
            System.out.println("Curent Orc Health : 0");
        }else
            System.out.println("Curent Orc Health : " + health);
    }


    public void generateAbility() {
        randome.add(0);
        randome.add(0);
        randome.add(0);
        randome.add(0);
        randome.add(0);
        randome.add(1);
    }
}

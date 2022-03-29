package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Elf extends Race{
    ArrayList<Integer> randome = new ArrayList<>();
    @Override
    public boolean Ability(ArrayList<Integer> list) {
        generateAbility();
        return list.get(new Random().nextInt(6)) == 1;
    }

    @Override
    public void TakeDamage(int i) {
        if(health < 0){
            health = 0;
            return;
        }
        if (Ability(randome)) {
            System.out.println("Elf is healing! ");
            health = 210 + (health - (i - armor));
        }else {
            health = health - (i - armor);
        }

    }

    @Override
    public int Attack() {
        System.out.println("Elf deal " + (getMin_dmg() + new Random().nextInt(getMax_dmg()-getMin_dmg()+1)) + " dmg");
        return (getMin_dmg() + new Random().nextInt(getMax_dmg()-getMin_dmg()+1));
    }

    public void currentHealth() {
        if(health < 0){
            System.out.println("Curent Elf Health : 0");
        }else
        System.out.println("Curent Elf Health : " + health);
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

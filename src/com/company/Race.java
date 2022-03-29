package com.company;

import java.util.ArrayList;

abstract public class Race {

    int health;
    int armor;
    int min_dmg;
    int max_dmg;

    public Race(int health, int armor, int min_dmg, int max_dmg) {
        this.health = health;
        this.armor = armor;
        this.min_dmg = min_dmg;
        this.max_dmg = max_dmg;
    }

    public int getHealth() {
        return health;
    }

    public int getArmor() {
        return armor;
    }

    public int getMin_dmg() {
        return min_dmg;
    }

    public int getMax_dmg() {
        return max_dmg;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setMin_dmg(int min_dmg) {
        this.min_dmg = min_dmg;
    }

    public void setMax_dmg(int max_dmg) {
        this.max_dmg = max_dmg;
    }

    public abstract boolean Ability(ArrayList<Integer> list);

    public abstract void TakeDamage(int i);

    public abstract int Attack();

    public abstract void currentHealth();

    @Override
    public String toString() {
        return "{" +
                "health=" + health +
                ", armor=" + armor +
                ", min_dmg=" + min_dmg +
                ", max_dmg=" + max_dmg +
                '}';
    }
}

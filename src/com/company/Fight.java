package com.company;

public class Fight {
    public static void main(String[] args) {
        Orc orc1 = new Orc();
        orc1.setArmor(100);
        orc1.setHealth(2000);
        orc1.setMax_dmg(200);
        orc1.setMin_dmg(100);

        Elf elf1 = new Elf();
        elf1.setArmor(50);
        elf1.setHealth(1500);
        elf1.setMax_dmg(300);
        elf1.setMin_dmg(110);

        System.out.println("The battle beggin!");
        System.out.println("Elf" + elf1);
        System.out.println("Orc" + orc1);

        while (true) {
            elf1.currentHealth();
            orc1.currentHealth();
            elf1.TakeDamage(orc1.Attack());
            orc1.TakeDamage(elf1.Attack());
            if(orc1.getHealth() == 0 && elf1.getHealth() == 0){
                System.out.println("Draw");
                break;
            }
            if (orc1.getHealth() == 0 || elf1.getHealth() == 0) {
                if (orc1.getHealth() == 0) {
                    System.out.println("Elf win!");
                    orc1.currentHealth();
                    elf1.currentHealth();
                    break;
                } else {
                    System.out.println("Orc win!");
                    orc1.currentHealth();
                    elf1.currentHealth();
                    break;
                }
            }
        }
    }
}

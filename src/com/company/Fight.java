package com.company;

public class Fight {
    public static void main(String[] args) {
        Orc orc1 = new Orc(2000, 100,100,200);

        Elf elf1 = new Elf(1500,50,110,300);

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

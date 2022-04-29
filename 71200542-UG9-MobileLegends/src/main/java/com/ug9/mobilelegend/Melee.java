package com.ug9.mobilelegend;

public class Melee extends Hero implements Skill {
    public Melee(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void attack(Character enemy) {
        if (enemy instanceof Minion || enemy instanceof Creep) {
            setHealthBonus(200);
            enemy.setHealth(enemy.getHealth()-this.getDamage());

        }
        else{
            enemy.setHealth(enemy.getHealth()-this.getDamage());
        }
        attackInformation(enemy, getDamage());
        super.attack(enemy);
    }


    @Override
    public void ultimate() {
        this.setDamage(this.getDamage() + 100);
        System.out.println(this.getName() + " mengaktifkan ulti damage saat ini bertambah " + 100);
    }
}

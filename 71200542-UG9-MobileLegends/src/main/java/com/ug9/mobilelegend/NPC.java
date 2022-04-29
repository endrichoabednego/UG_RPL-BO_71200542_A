package com.ug9.mobilelegend;

public class NPC extends Character {
    public NPC(String name, int damage, int health){
        super(name, damage, health);
    }

    @Override
    public void attack(Character enemy) {
        if (enemy.getHealth() <= 0) {
            enemy.setDie(true);
        } else {
            if (enemy instanceof Ranged || enemy instanceof Melee) {
                this.setDamage(this.getDamage() + 100);
                enemy.setHealth(enemy.getHealth()-this.getDamage());

            } else {
                this.setDamage((this.getDamage()));
                enemy.setHealth(enemy.getHealth()-this.getDamage());

            }
        }
        attackInformation(enemy,this.getDamage());
    }
}

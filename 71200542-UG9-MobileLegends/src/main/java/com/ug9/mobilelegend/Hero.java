package com.ug9.mobilelegend;

public class Hero extends Character {
    private int healthBonus;
    private int level = 1;
    private int healthMax;
    private int lifeSteal = 50;


    public Hero(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void attack(Character enemy) {
        if(enemy.getHealth()<= 0) {
            enemy.setDie(true);
            enemy.setHealth(0);
            this.level = this.level +1;
            if (enemy instanceof Melee || enemy instanceof Ranged) {
                this.lifeSteal += 150;
                this.setHealth(this.getHealth() + this.lifeSteal);

            }
            else if (enemy instanceof Minion || enemy instanceof Creep) {
                this.healthMax += this.healthBonus;
                this.setHealth(this.getHealth() + this.healthBonus);

            }
        }
    }


    public void addDamage(int damage) {
        this.setDamage(this.getDamage() + 150); ;

    }

    public void setHealthBonus(int healthBonus) {
        this.healthBonus = healthBonus;

    }

    public int getLevel() {
        return level;
    }
}
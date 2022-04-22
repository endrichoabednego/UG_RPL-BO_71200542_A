package com.rplbo.character;

public class Creep extends Character {

    public Creep(int damage, String name, int health) {
        super(20, "creep" , 200);
    }
    public void attack(Hero hero) {
        hero.health -= this.damage;
    }
}

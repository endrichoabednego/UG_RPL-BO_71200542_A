package com.rplbo.character;

public abstract class Character {
    protected int damage;
    protected String name;
    protected int health;

    public Character(int damage, String name, int health) {
        this.damage = damage;
        this.name = name;
        this.health = health;
    }

public boolean isDie () {
    if (this.health <= 0) {
        return true;
    } else {
        return false;
    }
}
public void showCharacterInfo() {
    System.out.println("Character : " + this.name);
    System.out.println("Health : " + this.health);
    System.out.println("Damage : " + this.damage);
    }
}
package com.rplbo.character;

public abstract class Hero extends Character implements AttackingCreep{
    public Hero(int damage, String name, int health) {
        super(damage, name, health);
    }
}

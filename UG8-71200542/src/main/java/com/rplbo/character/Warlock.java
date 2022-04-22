package com.rplbo.character;

public class Warlock extends Hero implements Summoner {
    private int numOfSummon;

    public Warlock() {
        super(80, "Warlock", 700);
    }

    @Override
    public void attack(Creep minion) {
        minion.health -= this.damage;

    }

    @Override
    public Character summon() {
        return null;
    }
}

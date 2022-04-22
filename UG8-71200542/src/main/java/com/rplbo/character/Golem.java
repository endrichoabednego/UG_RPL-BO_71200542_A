package com.rplbo.character;

public class Golem extends SummonCharacter implements Summoner{
    private int kill ;

    public Golem(Summoner summoner) {
        super(120, "Golem", 1000, summoner);
    }

    @Override
    public void attack(Creep minion) {
        minion.health = minion.health-this.damage;
        if (minion.isDie() == true) {
            this.kill += 1;

        }

    }

    @Override
    public Character summon() {
        if(this.kill > 0 )
        return null;
        return null;
    }
}

package com.rplbo.character;

public abstract class SummonCharacter extends Hero{
    private Summoner owner;


    public SummonCharacter(int damage, String name, int health, Summoner owner) {
        super(damage, name, health);
        this.owner = owner;
    }
}

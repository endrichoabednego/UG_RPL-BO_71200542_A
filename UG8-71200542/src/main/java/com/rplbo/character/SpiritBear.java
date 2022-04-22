package com.rplbo.character;

public class SpiritBear extends SummonCharacter {
    public SpiritBear(LoneDruid lonedruid) {
        super(130,"Spirit Bear" , 1000, lonedruid);
    }


    @Override
    public void attack(Creep minion) {
        minion.health-=this.damage;
    }
}
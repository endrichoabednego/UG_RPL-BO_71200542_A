package com.rplbo.character;

public class LoneDruid extends Hero implements Summoner, upgradeable{
    private int killCreep;
    private int level;

    public LoneDruid() {
        super(130, "SpiritBear", 1000);
    }



    @Override
    public Character summon() {
        return null;
    }

    @Override
    public void upgrade() {
        if (this.killCreep >= 3) {
            this.level = this.level+1;
            this.killCreep = this.killCreep - 3;
            this.damage = this.damage + 20;
            this.name = "Lone Druid" + this.level;
        }

    }
    @Override
    public void showCharacterInfo() {
        super.showCharacterInfo();
        System.out.println("Kill Creep : " + this.killCreep);
    }

    @Override
    public void attack(Creep minion) {

    }
}

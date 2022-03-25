package com.ug7.game;

public class Karakter {
    private Player player;
    private int weapon = 0;
    private int money = 5000;
    private int HP = 100;
    private boolean isWalk = false;

    public Karakter(Player player) {
        this.player = new Player(player.getUsername(), player.getPassword());
    }

    public void buyWeapon(int weapon) {
        if (weapon > 0 && weapon < 5) {
            this.weapon = weapon;
            short price;
            switch(weapon) {
                case 1:
                    price = 500;
                    break;
                case 2:
                    price = 3000;
                    break;
                case 3:
                    price = 2000;
                    break;
                case 4:
                    price = 4000;
                    break;
                default:
                    price = 0;
            }

            if (this.money >= price) {
                this.money -= price;
                System.out.println("Berhasil membeli senjata! Uang sekarang: " + this.getMoney());
            } else {
                System.out.println("Maaf uang kamu tidak mencukupi!");
            }
        } else {
            System.out.println("Pilihan yang kamu masukkan salah!");
        }
    }

    public void abilityAttack(Karakter karakter) {
        karakter.HP -= 0;
        karakter.receiveDamage(0);
    }

    public void normalAttack(Karakter karakter) {
        int damage;
        if (this.weapon==1 ) {
            damage = 20;

        }
        else if(this.weapon==2) {
            damage = 60;

        }
        else if(this.weapon==3) {
            damage = 25;

        }
        else if(this.weapon==4) {

            damage = 50;
        }
        else {
            damage = 0;
        }

        karakter.receiveDamage(damage);
    }

    public void receiveDamage(int damage) {
        this.HP -= damage;
        System.out.println(this.getPlayer().getUsername() + " terkena serangan! Sisa HP " + this.getPlayer().getUsername() + ": " + this.getHP());
        if (this.getHP() <= 0) {
            this.HP = 0;
            System.out.println(this.getPlayer().getUsername() + " mati!");
        }

    }

    public void receiveHP(int hp) {
        this.HP += hp;
        if (this.getHP() > 100) {
            this.HP = 100;
        }

        System.out.println("HP sekarang: " + this.getHP());
    }

    public void getInfo() {
        System.out.println("Username: " + this.getPlayer().getUsername());
        System.out.println("Level: " + this.getPlayer().getLevel());
        System.out.println("Money: " + this.getMoney());
        String isDie = "";
        if (this.getHP() <= 0) {
            isDie = "[Mati]";
        }

        System.out.println("HP: " + this.getHP() + " " + isDie);
        String weapon;
            if (this.weapon==1 ) {
                weapon = "Pisau";

            }
            else if(this.weapon==2) {
                weapon = "Tongkat Sihir";

            }
            else if(this.weapon==3) {
                weapon = "Tongkat";

            }
            else if(this.weapon==4) {

            weapon = "Katana";
        }
            else {
                weapon = "Knife";
        }

        System.out.println("Weapon: " + weapon);
        String movementtype;
        if (this.isWalk) {
            movementtype = "Berjalan";
        } else {
            movementtype = "Berlari";
        }

        System.out.println("movementtype: " + movementtype);
        System.out.println();
    }

    public void walk(boolean type) {
        this.isWalk = type;
    }

    public Player getPlayer() {
        return this.player;
    }

    public int getHP() {
        return this.HP;
    }

    public int getMoney() {
        return this.money;
    }

    public int getWeapon() {
        return this.weapon;
    }

    public boolean isWalk() {
        return this.isWalk;
    }
}

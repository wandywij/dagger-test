package com.wnd.dagger.weapon;


public class Laser implements Weapon {

    private int attack;
    private int velocity;

    public Laser(int attack, int velocity) {
        this.attack = attack;
        this.velocity = velocity;
    }

    @Override
    public int doAttack() {
        return attack * 2;
    }

    @Override
    public int velocity() {
        return velocity * 3;
    }
}


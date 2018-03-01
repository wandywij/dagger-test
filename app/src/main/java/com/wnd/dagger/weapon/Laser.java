package com.wnd.dagger.weapon;


public class Laser implements Weapon {
    int attack = 10;
    int velocity = 100;

    public Laser(int attack, int velocity) {
        this.attack = attack;
        this.velocity = velocity;
    }

    @Override
    public int doAttack() {
        return 2 * attack;
    }

    @Override
    public int velocity() {
        return 3 * velocity;
    }
}


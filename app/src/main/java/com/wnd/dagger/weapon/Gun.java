package com.wnd.dagger.weapon;

public class Gun implements Weapon {

    private int attack;
    private int velocity;

    public Gun(int attack, int velocity) {
        this.attack = attack;
        this.velocity = velocity;
    }

    @Override
    public int doAttack() {
        return attack + 70;
    }

    @Override
    public int velocity() {
        return velocity * 13;
    }
}

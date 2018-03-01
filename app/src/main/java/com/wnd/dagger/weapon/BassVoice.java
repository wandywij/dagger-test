package com.wnd.dagger.weapon;

public class BassVoice implements Weapon {

    private int attack;
    private int velocity;

    public BassVoice(int attack, int velocity) {
        this.attack = attack;
        this.velocity = velocity;
    }

    @Override
    public int doAttack() {
        return attack;
    }

    @Override
    public int velocity() {
        return velocity;
    }
}

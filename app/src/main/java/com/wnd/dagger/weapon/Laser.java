package com.wnd.dagger.weapon;


public class Laser implements Weapon {

    @Override
    public int doAttack() {
        return 11;
    }

    @Override
    public int velocity() {
        return 13;
    }
}

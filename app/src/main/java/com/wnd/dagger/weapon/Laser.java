package com.wnd.dagger.weapon;


public class Laser implements Weapon {

    @Override
    public int doAttack() {
        return 2;
    }

    @Override
    public int velocity() {
        return 3;
    }
}


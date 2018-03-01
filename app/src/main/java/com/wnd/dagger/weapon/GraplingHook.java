package com.wnd.dagger.weapon;


public class GraplingHook implements Weapon {

    @Override
    public int doAttack() {
        return 50;
    }

    @Override
    public int velocity() {
        return 12;
    }
}

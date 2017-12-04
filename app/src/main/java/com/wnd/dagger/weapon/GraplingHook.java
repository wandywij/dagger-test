package com.wnd.dagger.weapon;

/**
 * Created by wandy on 12/4/17.
 */

public class GraplingHook implements Weapon {

    @Override
    public int doAttack() {
        return 15;
    }

    @Override
    public int velocity() {
        return 100;
    }
}

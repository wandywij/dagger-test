package com.wnd.dagger.weapon;

public class BassVoice implements Weapon {

    @Override
    public int doAttack() {
        return 4;
    }

    @Override
    public int velocity() {
        return 400;
    }
}

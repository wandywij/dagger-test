package com.wnd.dagger.best;

import com.wnd.dagger.weapon.BassVoice;
import com.wnd.dagger.weapon.Weapon;


public class BadAssBatman {

    private Weapon weapon;

    public BadAssBatman(Weapon weapon) {
        this.weapon = weapon;
    }

    public int doAttack() {
        return weapon.doAttack();
    }

    public int velocity() {
        return weapon.velocity();
    }


}

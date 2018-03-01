package com.wnd.dagger.good;

import com.wnd.dagger.weapon.BassVoice;
import com.wnd.dagger.weapon.Batarang;
import com.wnd.dagger.weapon.Weapon;


public class GoodBatman {
    Weapon weapon;

    public GoodBatman(Weapon weapon) {
        this.weapon = weapon;
    }

    public int attack() {
        return weapon.doAttack();
    }

    public int attackSpeed() {
        return weapon.velocity();
    }
}

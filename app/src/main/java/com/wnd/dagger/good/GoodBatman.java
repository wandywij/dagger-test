package com.wnd.dagger.good;

import com.wnd.dagger.weapon.Batarang;


public class GoodBatman {

    Batarang batarang;
    public GoodBatman(Batarang batarang) {
        this.batarang = batarang;
    }

    public int attack() {
        return batarang.doAttack();
    }

    public int attackSpeed() {
        return batarang.velocity();
    }
}

package com.wnd.dagger.bad;

import com.wnd.dagger.weapon.Batarang;

public class BadBatman {
    Batarang batarang;

    public BadBatman() {
        batarang = new Batarang(12, 20);
    }

    public int attack() {
        return batarang.doAttack();
    }

    public int attackSpeed() {
        return batarang.velocity();
    }
}

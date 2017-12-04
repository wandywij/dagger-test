package com.wnd.dagger.bad;

import com.wnd.dagger.weapon.Batarang;

/**
 * Created by Wandy on 03/12/17.
 */

public class BadBatman {

    Batarang batarang;

    public BadBatman() {
        batarang = new Batarang(12
                , 20);
    }

    public int attack() {
        return batarang.doAttack();
    }

    public int attackSpeed() {
        return batarang.velocity();
    }

    public void setupWeapon() {
        batarang = new Batarang(12
                , 20);
    }
}

package com.wnd.dagger.good;

import com.wnd.dagger.weapon.Batarang;

/**
 * Created by Wandy on 03/12/17.
 */

public class Batman {

    Batarang batarang;

    public Batman(Batarang batarang) {
        //batarang = new Batarang(12, 20);

        this.batarang = batarang;
    }

    public int attack() {
        return batarang.doAttack();
    }

    public int attackSpeed() {
        return batarang.velocity();
    }
}

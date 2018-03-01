package com.wnd.dagger.best;

import com.wnd.dagger.weapon.Weapon;

public class IronMan {
    Weapon weapon;

    public IronMan(Weapon weapon) {
        this.weapon = weapon;
    }

    public int doAttack() {
        return weapon.doAttack();
    }

    public int velocity() {
        return weapon.velocity();
    }
}

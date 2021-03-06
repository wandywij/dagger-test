package com.wnd.dagger.weapon;


public class FasterBatarang implements Weapon {
    private int attackPower = 30;
    private int attackSpeed = 40;

    public FasterBatarang() {

    }

    @Override
    public int doAttack() {
        return 3 * attackPower;
    }

    @Override
    public int velocity() {
        return 4 * attackSpeed;
    }
}

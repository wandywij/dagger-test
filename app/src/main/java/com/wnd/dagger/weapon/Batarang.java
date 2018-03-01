package com.wnd.dagger.weapon;

public class Batarang {

    private int attackPower = 30;
    private int attackSpeed = 25;

    public Batarang() {

    }

    public Batarang(int attackPower, int attackSpeed) {
        this.attackPower = attackPower;
        this.attackSpeed = attackSpeed;
    }

    public int doAttack() {
        return 2 * attackPower;
    }

    public int velocity() {
        return 3 * attackSpeed;
    }
}

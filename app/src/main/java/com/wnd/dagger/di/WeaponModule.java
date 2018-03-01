package com.wnd.dagger.di;

import com.wnd.dagger.weapon.BassVoice;
import com.wnd.dagger.weapon.FasterBatarang;
import com.wnd.dagger.weapon.GraplingHook;
import com.wnd.dagger.weapon.Laser;
import com.wnd.dagger.weapon.Weapon;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;


@Module
public class WeaponModule {
    private int attack;
    private int velocity;

    public WeaponModule() {
    }

    public WeaponModule(int attack, int velocity) {
        this.attack = attack;
        this.velocity = velocity;
    }

    @Provides
    public Weapon provideDefaultWeapon() {
        return new FasterBatarang();
    }

    @Provides
    @Named("grapling_hook")
    public Weapon provideGraplingHook() {
        return new GraplingHook();
    }

    /*@Provides
    //@Named("bass-voice")
    public Weapon provideBassVoice(int attack, int velocity) {
        return new BassVoice(attack, velocity);
    }*/

    @Provides
    @Named("laser")
    public Weapon provideLaser(@Named("attack") int attack, @Named("velocity") int velocity) {
        return new Laser(attack, velocity);
    }

    @Provides
    @Named("attack")
    public int provideAttack() {
        return attack;
    }

    @Provides
    @Named("velocity")
    public int provideVelocity() {
        return velocity;
    }
}

package com.wnd.dagger.di;

import com.wnd.dagger.weapon.BassVoice;
import com.wnd.dagger.weapon.GraplingHook;
import com.wnd.dagger.weapon.Gun;
import com.wnd.dagger.weapon.Laser;
import com.wnd.dagger.weapon.Weapon;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;


@Module
public class WeaponModule {

    private int attack = 1;
    private int velocity = 1;

    public WeaponModule(int attack, int velocity) {
        this.attack = attack;
        this.velocity = velocity;
    }

    public WeaponModule() {

    }

    @Provides
    public Weapon provideDefaultWeapon() {
        return new Laser();
    }

    @Provides
    @Named("gun")
    public Weapon provideGun(@Named("attack") int attack
            , @Named("velocity") int velocity) {
        return new Gun(attack, velocity);
    }

    @Provides
    @Named("laser")
    public Weapon provideLaser() {
        return new Laser();
    }

    @Provides
    @Named("attack")
    public int provideAttack() {
        return this.attack;
    }

    @Provides
    @Named("velocity")
    public int provideVelocity() {
        return this.velocity;
    }


    /*@Provides
   // @Named("grapling_hook")
    public Weapon provideGraplingHook(int attack, int velocity) {
        return new GraplingHook(attack, velocity);
    }*/

    /*@Provides
    //@Named("bass-voice")
    public Weapon provideBassVoice(int attack, int velocity) {
        return new BassVoice(attack, velocity);
    }*/

    /*@Provides
    //@Named("laser")
    public Weapon provideLaser(final int attack, final int velocity) { return new Laser(attack, velocity); }*/
}

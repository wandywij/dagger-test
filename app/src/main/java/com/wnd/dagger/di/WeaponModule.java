package com.wnd.dagger.di;

import com.wnd.dagger.weapon.BassVoice;
import com.wnd.dagger.weapon.GraplingHook;
import com.wnd.dagger.weapon.Laser;
import com.wnd.dagger.weapon.Weapon;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;


@Module
public class WeaponModule {

    @Provides
    public Weapon provideDefaultWeapon(int attack, int velocity) {
        return new Laser(attack, velocity);
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

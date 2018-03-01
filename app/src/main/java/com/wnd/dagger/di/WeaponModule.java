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
    public Weapon provideDefaultWeapon() {
        return new GraplingHook();
    }

    @Provides
    @Named("grapling_hook")
    public Weapon provideGraplingHook() {
        return new GraplingHook();
    }

    @Provides
    @Named("bass-voice")
    public Weapon provideBassVoice() {
        return new BassVoice();
    }

    @Provides
    @Named("laser")
    public Weapon provideLaser() { return new Laser(); }
}

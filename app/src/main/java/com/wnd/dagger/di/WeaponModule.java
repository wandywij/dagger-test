package com.wnd.dagger.di;

import com.wnd.dagger.weapon.BassVoice;
import com.wnd.dagger.weapon.GraplingHook;
import com.wnd.dagger.weapon.Weapon;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wandy on 12/4/17.
 */

@Module
public class WeaponModule {

    @Provides
    public Weapon provideWeapon() {
        return new GraplingHook();
    }

    @Provides
    @Named("bass_voice")
    public Weapon provideBassVoice() {
        return new BassVoice();
    }
}

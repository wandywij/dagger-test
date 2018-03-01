package com.wnd.dagger.di;

import com.wnd.dagger.weapon.BassVoice;
import com.wnd.dagger.weapon.GraplingHook;
import com.wnd.dagger.weapon.Weapon;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;


@Module
public class TestWeaponModule extends WeaponModule {

    @Provides @Named("test_grapling_hook")
    public Weapon provideTestWeapon() {
        return new GraplingHook();
    }

    @Provides @Named("test_bass_voice")
    public Weapon provideBassVoice() {
        return new BassVoice();
    }
}

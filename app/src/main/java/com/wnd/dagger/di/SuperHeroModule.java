package com.wnd.dagger.di;

import com.wnd.dagger.best.BadAssBatman;
import com.wnd.dagger.weapon.FasterBatarang;
import com.wnd.dagger.weapon.Weapon;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wandy on 12/4/17.
 */

@Module
public class SuperHeroModule {

    @Provides
    public BadAssBatman provideBatman(Weapon weapon) {
        return new BadAssBatman(weapon);
    }

    @Provides
    @Named("with-bass-voice")
    public BadAssBatman provideBatmanWithBassVoice(@Named("bass_voice") Weapon weapon) {
        return new BadAssBatman(weapon);
    }
}

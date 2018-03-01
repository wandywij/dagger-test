package com.wnd.dagger.di;

import com.wnd.dagger.best.BadAssBatman;
import com.wnd.dagger.weapon.Weapon;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;


@Module
public class TestSuperHeroModule extends SuperHeroModule {

    @Provides @Named("test_batman_with_bass_voice")
    public BadAssBatman provideTestBatmanWithBassVoice(@Named("bass_voice") Weapon weapon) {
        return new BadAssBatman(weapon);
    }

    @Provides @Named("test_batman_with_grapling_hook")
    public BadAssBatman provideTestBatman(@Named("grapling_hook") Weapon weapon) {
        return new BadAssBatman(weapon);
    }

}

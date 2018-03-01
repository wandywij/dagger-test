package com.wnd.dagger.di;

import com.wnd.dagger.best.BadAssBatman;
import com.wnd.dagger.best.IronMan;
import com.wnd.dagger.weapon.Weapon;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;


@Module
public class SuperHeroModule {

    @Provides
    public BadAssBatman provideDefaultBatman(Weapon weapon) {
        return new BadAssBatman(weapon);
    }

    /*@Provides
    @Named("grapling_hook")
    public BadAssBatman provideBatmanWithGraplingHook(@Named("grapling_hook") Weapon weapon) {
        return new BadAssBatman(weapon);
    }

    @Provides
    @Named("laser")
    public BadAssBatman provideBatmanWithLaser(@Named("laser") Weapon weapon) {
        return new BadAssBatman(weapon);
    }


    @Provides
    public IronMan provideIronman(@Named("laser") Weapon weapon) {
        return new IronMan(weapon);
    }

    @Provides
    @Named("with-bass-voice")
    public BadAssBatman provideBatmanWithBassVoice(@Named("bass-voice") Weapon weapon) {
        return new BadAssBatman(weapon);
    }*/

}

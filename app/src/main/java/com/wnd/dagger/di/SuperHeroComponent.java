package com.wnd.dagger.di;

/**
 * Created by wandy on 12/4/17.
 */

import com.wnd.dagger.MainActivity;

import dagger.Component;

@Component(modules = { SuperHeroModule.class, WeaponModule.class})
public interface SuperHeroComponent {
    void inject(MainActivity activity);
}

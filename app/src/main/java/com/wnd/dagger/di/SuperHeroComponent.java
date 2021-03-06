package com.wnd.dagger.di;


import com.wnd.dagger.MainActivity;

import dagger.Component;

@Component(modules = { SuperHeroModule.class, WeaponModule.class})
public interface SuperHeroComponent {
    void inject(MainActivity activity);
}

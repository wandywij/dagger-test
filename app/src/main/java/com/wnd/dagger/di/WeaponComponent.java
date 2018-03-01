package com.wnd.dagger.di;

import com.wnd.dagger.MainActivity;
import com.wnd.dagger.weapon.Weapon;

import dagger.BindsInstance;
import dagger.Component;


@Component(modules = WeaponModule.class)
public interface WeaponComponent {
    Weapon weapon();

    //void inject(MainActivity activity);


}

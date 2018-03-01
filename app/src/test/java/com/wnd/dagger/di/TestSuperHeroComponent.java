package com.wnd.dagger.di;

import com.wnd.dagger.ExampleUnitTest;

import dagger.Component;


@Component(modules = {TestSuperHeroModule.class, TestWeaponModule.class})
public interface TestSuperHeroComponent extends SuperHeroComponent {
    void inject(ExampleUnitTest exampleUnitTest);
}

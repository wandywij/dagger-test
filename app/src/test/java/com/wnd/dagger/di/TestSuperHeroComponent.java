package com.wnd.dagger.di;

import com.wnd.dagger.ExampleUnitTest;

import dagger.Component;

/**
 * Created by wandy on 12/4/17.
 */

@Component(modules = {TestSuperHeroModule.class, TestWeaponModule.class})
public interface TestSuperHeroComponent extends SuperHeroComponent {
    void inject(ExampleUnitTest exampleUnitTest);
}

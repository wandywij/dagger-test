package com.wnd.dagger;

import com.wnd.dagger.best.BadAssBatman;
import com.wnd.dagger.di.DaggerTestSuperHeroComponent;
import com.wnd.dagger.di.TestSuperHeroComponent;
import com.wnd.dagger.di.TestSuperHeroModule;
import com.wnd.dagger.di.TestWeaponModule;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;
import javax.inject.Named;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    private TestSuperHeroComponent superHeroComponent;

    @Inject @Named("test_batman_with_bass_voice")
    BadAssBatman badAssBatmanWithBassVoice;

    @Inject @Named("test_batman_with_grapling_hook")
    BadAssBatman badAssBatmanWithGraplingHook;

    @Before
    public void before() {
        superHeroComponent = DaggerTestSuperHeroComponent.builder()
                .testSuperHeroModule(new TestSuperHeroModule())
                .testWeaponModule(new TestWeaponModule())
                .build();
        superHeroComponent.inject(this);
    }


    @Test
    public void attackWithBassVoice_isCorrect() throws Exception {
        Assert.assertEquals(badAssBatmanWithBassVoice.doAttack(), 0);
        Assert.assertEquals(badAssBatmanWithBassVoice.velocity(), 120000);
    }

    @Test
    public void attackWithGraplingHook_isCorrect() throws Exception {
        Assert.assertEquals(badAssBatmanWithGraplingHook.doAttack(), 15);
        Assert.assertEquals(badAssBatmanWithGraplingHook.velocity(), 100);
    }
}
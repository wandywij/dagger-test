package com.wnd.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.wnd.dagger.bad.BadBatman;
import com.wnd.dagger.best.BadAssBatman;
import com.wnd.dagger.di.DaggerSuperHeroComponent;
import com.wnd.dagger.di.DaggerWeaponComponent;
import com.wnd.dagger.di.SuperHeroComponent;
import com.wnd.dagger.di.SuperHeroModule;
import com.wnd.dagger.di.WeaponComponent;
import com.wnd.dagger.di.WeaponModule;
import com.wnd.dagger.weapon.GraplingHook;
import com.wnd.dagger.weapon.Weapon;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    TextView tvAttackPower, tvAttackSpeed, tvAttackPowerBadAss, tvAttackSpeedBadAss;
    private SuperHeroComponent superHeroComponent;
    private WeaponComponent weaponComponent;

    @Inject
    @Named("with-bass-voice")
    BadAssBatman badAssBatman;

    @Inject
    GraplingHook graplingHook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAttackPower = (TextView) this.findViewById(R.id.tv_attackpower);
        tvAttackSpeed = (TextView) this.findViewById(R.id.tv_attackspeed);

        BadBatman badBatman = new BadBatman();
        int attackPower = badBatman.attack();
        int attackSpeed = badBatman.attackSpeed();
        tvAttackPower.setText(attackPower + "");
        tvAttackSpeed.setText(attackSpeed + "");

        setupWeaponComponent();
    }

    public void setupWeaponComponent() {
        superHeroComponent = DaggerSuperHeroComponent.builder()
                .superHeroModule(new SuperHeroModule())
                .weaponModule(new WeaponModule())
                .build();

        weaponComponent = DaggerWeaponComponent.builder()
                .weaponModule(new WeaponModule())
                .build();
        weaponComponent.inject(this);
        superHeroComponent.inject(this);

        tvAttackPowerBadAss = (TextView) this.findViewById(R.id.tv_attackpower_badassbatman);
        tvAttackSpeedBadAss = (TextView) this.findViewById(R.id.tv_attackspeed_badassbatman);
        tvAttackPowerBadAss.setText(
                badAssBatman.doAttack() + "");
        tvAttackSpeedBadAss.setText(
                badAssBatman.velocity() + "");

    }
}

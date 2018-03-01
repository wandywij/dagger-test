package com.wnd.dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.wnd.dagger.best.BadAssBatman;
import com.wnd.dagger.di.DaggerSuperHeroComponent;
import com.wnd.dagger.di.SuperHeroComponent;
import com.wnd.dagger.di.SuperHeroModule;
import com.wnd.dagger.di.WeaponModule;

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GoodActivity extends AppCompatActivity {

    private SuperHeroComponent superHeroComponent;

    @BindView(R.id.tv_attackpower_a)
    TextView tvAttackPowerA;
    @BindView(R.id.tv_attackspeed_a)
    TextView tvAttackSpeedA;
    @BindView(R.id.tv_attackpower_b)
    TextView tvAttackPowerB;
    @BindView(R.id.tv_attackspeed_b)
    TextView tvAttackSpeedB;

    @Inject
    BadAssBatman defaultBadAssBatman;
    @Inject
    @Named("laser")
    BadAssBatman badAssBatmanWithLaser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_good);
        ButterKnife.bind(this);

        setupWeaponComponent();
    }

    public void setupWeaponComponent() {
        superHeroComponent = DaggerSuperHeroComponent.builder()
                .superHeroModule(new SuperHeroModule())
                .weaponModule(new WeaponModule(5, 5))
                .build();

        superHeroComponent.inject(this);

        displayBatmans();
    }

    private void displayBatmans() {
        tvAttackPowerA.setText(defaultBadAssBatman.doAttack() + "");
        tvAttackSpeedA.setText(defaultBadAssBatman.velocity() + "");

        tvAttackPowerB.setText(badAssBatmanWithLaser.doAttack() + "");
        tvAttackSpeedB.setText(badAssBatmanWithLaser.velocity() + "");
    }
}

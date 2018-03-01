package com.wnd.dagger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.wnd.dagger.bad.BadBatman;
import com.wnd.dagger.di.SuperHeroComponent;
import com.wnd.dagger.di.WeaponComponent;
import com.wnd.dagger.good.GoodBatman;
import com.wnd.dagger.weapon.BassVoice;
import com.wnd.dagger.weapon.Batarang;
import com.wnd.dagger.weapon.FasterBatarang;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private SuperHeroComponent superHeroComponent;
    private WeaponComponent weaponComponent;

    @BindView(R.id.tv_attackpower_a)
    TextView tvAttackPowerA;
    @BindView(R.id.tv_attackspeed_a)
    TextView tvAttackSpeedA;
    @BindView(R.id.tv_attackpower_b)
    TextView tvAttackPowerB;
    @BindView(R.id.tv_attackspeed_b)
    TextView tvAttackSpeedB;
    @BindView(R.id.tv_attackpower_c)
    TextView tvAttackPowerC;
    @BindView(R.id.tv_attackspeed_c)
    TextView tvAttackSpeedC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        BadBatman badBatman = new BadBatman();
        tvAttackPowerA.setText(badBatman.attack() + "");
        tvAttackSpeedA.setText(badBatman.attackSpeed() + "");

        GoodBatman goodBatman = new GoodBatman(new FasterBatarang());
        tvAttackPowerB.setText(goodBatman.attack() + "");
        tvAttackSpeedB.setText(goodBatman.attackSpeed() + "");

        GoodBatman goodBatmanWithBassVoice = new GoodBatman(new BassVoice());
        tvAttackPowerC.setText(goodBatmanWithBassVoice.attack() + "");
        tvAttackSpeedC.setText(goodBatmanWithBassVoice.attackSpeed() + "");
    }

    @OnClick(R.id.goto_good)
    public void gotoGoodActivity() {
        startActivity(new Intent(this, GoodActivity.class));
    }
}

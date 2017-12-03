package com.wnd.dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.wnd.dagger.bad.Batman;

public class MainActivity extends AppCompatActivity {

    TextView tvAttackPower, tvAttackSpeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAttackPower = (TextView) this.findViewById(R.id.tv_attackpower);
        tvAttackSpeed = (TextView) this.findViewById(R.id.tv_attackspeed);

        Batman batman = new Batman();
        int attackPower = batman.attack();
        int attackSpeed = batman.attackSpeed();
        tvAttackPower.setText(attackPower + "");
        tvAttackSpeed.setText(attackSpeed + "");
    }
}

package com.wnd.dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wnd.dagger.bad.BadBatman;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);


        BadBatman batmanComic = new BadBatman();
        int attackPower = batmanComic.attack();
        int attackSpeed = batmanComic.attackSpeed();

        BadBatman batmanNewEra = new BadBatman();
    }
}

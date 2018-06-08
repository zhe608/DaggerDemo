package com.mx.daggerdemo;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

/**
 * @author Administrator
 */
public class TestActivity extends AppCompatActivity {
    @Inject
    A a;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        DaggerModuleInjector.create().inject(this);
        a.show();
    }
}

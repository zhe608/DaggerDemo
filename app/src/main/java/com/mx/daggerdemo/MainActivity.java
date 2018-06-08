package com.mx.daggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

/**
 * @author Administrator
 */
public class MainActivity extends AppCompatActivity {
    @Inject
    A a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 获取DaggerModuleInjector实例,调用inject方法
        DaggerModuleInjector.create().inject(this);
        a.show();
    }
}

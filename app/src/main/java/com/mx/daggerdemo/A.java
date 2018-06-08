package com.mx.daggerdemo;

import android.util.Log;

import javax.inject.Inject;

/**
 * @author Administrator
 */
public class A {
    @Inject
    public A (){

    }

    public void show(){
        Log.d("TAG", "show: this is A class");
		Log.d("TAG", "show: this is A class");
    }
}

package com.mx.daggerdemo;

import dagger.Component;

/**
 * @author Administrator
 */
@Component
public interface ModuleInjector {

    void inject(MainActivity mainActivity);

    void inject(TestActivity testActivity);
}
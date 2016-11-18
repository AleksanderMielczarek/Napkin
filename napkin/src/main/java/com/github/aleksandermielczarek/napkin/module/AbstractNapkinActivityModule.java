package com.github.aleksandermielczarek.napkin.module;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Aleksander Mielczarek on 18.11.2016.
 */

abstract class AbstractNapkinActivityModule implements NapkinActivityModuleProvider {

    protected final AppCompatActivity activity;

    public AbstractNapkinActivityModule(AppCompatActivity activity) {
        this.activity = activity;
    }

}

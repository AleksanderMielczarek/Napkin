package com.github.aleksandermielczarek.napkin.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Aleksander Mielczarek on 18.11.2016.
 */

interface NapkinActivityModuleProvider {

    AppCompatActivity provideActivity();

    Context provideContext();
}

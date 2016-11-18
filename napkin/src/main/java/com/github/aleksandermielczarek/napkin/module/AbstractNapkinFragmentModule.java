package com.github.aleksandermielczarek.napkin.module;

import android.support.v4.app.Fragment;

/**
 * Created by Aleksander Mielczarek on 18.11.2016.
 */

abstract class AbstractNapkinFragmentModule implements NapkinFragmentModuleProvider {

    protected final Fragment fragment;

    public AbstractNapkinFragmentModule(Fragment fragment) {
        this.fragment = fragment;
    }

}

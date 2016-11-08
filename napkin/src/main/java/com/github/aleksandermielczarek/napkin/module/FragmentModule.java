package com.github.aleksandermielczarek.napkin.module;


import android.support.v4.app.Fragment;

import com.github.aleksandermielczarek.napkin.scope.FragmentScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 08.11.2016.
 */
@Module
@FragmentScope
public class FragmentModule {

    private final Fragment fragment;

    public FragmentModule(Fragment fragment) {
        this.fragment = fragment;
    }

    @Provides
    @FragmentScope
    Fragment provideFragment() {
        return fragment;
    }

}

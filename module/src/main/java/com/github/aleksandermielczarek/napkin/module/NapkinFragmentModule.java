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
public class NapkinFragmentModule extends AbstractNapkinFragmentModule {

    public NapkinFragmentModule(Fragment fragment) {
        super(fragment);
    }

    @Override
    @Provides
    @FragmentScope
    public Fragment provideFragment() {
        return fragment;
    }

}

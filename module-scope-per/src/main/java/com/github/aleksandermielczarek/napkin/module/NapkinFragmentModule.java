package com.github.aleksandermielczarek.napkin.module;


import android.support.v4.app.Fragment;

import com.github.aleksandermielczarek.napkin.scope.PerFragment;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 08.11.2016.
 */
@Module
@PerFragment
public class NapkinFragmentModule extends AbstractNapkinFragmentModule {

    public NapkinFragmentModule(Fragment fragment) {
        super(fragment);
    }

    @Override
    @Provides
    @PerFragment
    public Fragment provideFragment() {
        return fragment;
    }

}

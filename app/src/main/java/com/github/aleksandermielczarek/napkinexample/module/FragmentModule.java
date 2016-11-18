package com.github.aleksandermielczarek.napkinexample.module;

import android.support.v4.app.Fragment;

import com.github.aleksandermielczarek.napkin.module.NapkinFragmentModule;
import com.github.aleksandermielczarek.napkin.scope.FragmentScope;
import com.github.aleksandermielczarek.napkinexample.qualifier.FragmentString;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 18.11.2016.
 */
@Module
@FragmentScope
public class FragmentModule extends NapkinFragmentModule {

    public FragmentModule(Fragment fragment) {
        super(fragment);
    }

    @Provides
    @FragmentString
    String provideNapkinString() {
        return "Hello Napkin in Fragment!";
    }
}

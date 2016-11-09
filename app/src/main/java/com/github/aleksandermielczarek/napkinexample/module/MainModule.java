package com.github.aleksandermielczarek.napkinexample.module;

import com.github.aleksandermielczarek.napkin.scope.AppScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 13.05.2016.
 */
@Module
@AppScope
public class MainModule {

    @Provides
    String provideNapkinString() {
        return "Hello Napkin!";
    }

}

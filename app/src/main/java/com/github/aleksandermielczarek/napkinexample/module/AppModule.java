package com.github.aleksandermielczarek.napkinexample.module;

import android.app.Application;

import com.github.aleksandermielczarek.napkin.module.NapkinAppModule;
import com.github.aleksandermielczarek.napkin.scope.AppScope;
import com.github.aleksandermielczarek.napkinexample.qualifier.AppString;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 13.05.2016.
 */
@Module
@AppScope
public class AppModule extends NapkinAppModule {

    public AppModule(Application application) {
        super(application);
    }

    @Provides
    @AppString
    String provideNapkinString() {
        return "Hello Napkin in App!";
    }

}

package com.github.aleksandermielczarek.napkin.module;

import android.app.Application;
import android.content.Context;

import com.github.aleksandermielczarek.napkin.qualifier.AppContext;
import com.github.aleksandermielczarek.napkin.scope.PerApp;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 08.11.2016.
 */
@Module
@PerApp
public class AppModule {

    private final Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @PerApp
    Application provideApplication() {
        return application;
    }

    @Provides
    @PerApp
    @AppContext
    Context provideContext() {
        return application;
    }
}

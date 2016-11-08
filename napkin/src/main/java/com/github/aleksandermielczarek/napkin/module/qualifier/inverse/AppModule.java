package com.github.aleksandermielczarek.napkin.module.qualifier.inverse;

import android.app.Application;
import android.content.Context;

import com.github.aleksandermielczarek.napkin.qualifier.inverse.ContextApp;
import com.github.aleksandermielczarek.napkin.scope.AppScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 08.11.2016.
 */
@Module
@AppScope
public class AppModule {

    private final Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @AppScope
    Application provideApplication() {
        return application;
    }

    @Provides
    @AppScope
    @ContextApp
    Context provideContext() {
        return application;
    }
}

package com.github.aleksandermielczarek.napkin.module.scope.per.qualifier.inverse;

import android.app.Application;
import android.content.Context;

import com.github.aleksandermielczarek.napkin.qualifier.inverse.ContextApp;
import com.github.aleksandermielczarek.napkin.scope.per.PerApp;

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
    @ContextApp
    Context provideContext() {
        return application;
    }
}

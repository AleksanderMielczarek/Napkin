package com.github.aleksandermielczarek.napkin.module;

import android.app.Application;
import android.content.Context;

import com.github.aleksandermielczarek.napkin.qualifier.ContextApp;
import com.github.aleksandermielczarek.napkin.scope.ScopeApp;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 08.11.2016.
 */
@Module
@ScopeApp
public class AppModule {

    private final Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @ScopeApp
    Application provideApplication() {
        return application;
    }

    @Provides
    @ScopeApp
    @ContextApp
    Context provideContext() {
        return application;
    }
}

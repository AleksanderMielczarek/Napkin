package com.github.aleksandermielczarek.napkin.module;

import android.app.Application;
import android.content.Context;

import com.github.aleksandermielczarek.napkin.qualifier.ContextApp;
import com.github.aleksandermielczarek.napkin.scope.AppScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 08.11.2016.
 */
@Module
@AppScope
public class NapkinAppModule extends AbstractNapkinAppModule {

    public NapkinAppModule(Application application) {
        super(application);
    }

    @Override
    @Provides
    @AppScope
    public Application provideApplication() {
        return application;
    }

    @Override
    @Provides
    @AppScope
    @ContextApp
    public Context provideContext() {
        return application;
    }
}

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
public class NapkinAppModule extends AbstractNapkinAppModule {

    public NapkinAppModule(Application application) {
        super(application);
    }

    @Override
    @Provides
    @PerApp
    public Application provideApplication() {
        return application;
    }

    @Override
    @Provides
    @PerApp
    @AppContext
    public Context provideContext() {
        return application;
    }
}

package com.github.aleksandermielczarek.napkin.module.scope.per.qualifier.inverse;

import android.content.Context;

import com.github.aleksandermielczarek.napkin.qualifier.inverse.ContextService;
import com.github.aleksandermielczarek.napkin.scope.per.PerService;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 08.11.2016.
 */
@Module
@PerService
public class ServiceModule {

    private final Context context;

    public ServiceModule(Context context) {
        this.context = context;
    }

    @Provides
    @PerService
    @ContextService
    Context provideContext() {
        return context;
    }
}

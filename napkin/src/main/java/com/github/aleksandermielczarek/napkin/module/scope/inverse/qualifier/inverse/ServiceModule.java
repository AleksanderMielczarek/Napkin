package com.github.aleksandermielczarek.napkin.module.scope.inverse.qualifier.inverse;

import android.content.Context;

import com.github.aleksandermielczarek.napkin.qualifier.inverse.ContextService;
import com.github.aleksandermielczarek.napkin.scope.inverse.ScopeService;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 08.11.2016.
 */
@Module
@ScopeService
public class ServiceModule {

    private final Context context;

    public ServiceModule(Context context) {
        this.context = context;
    }

    @Provides
    @ScopeService
    @ContextService
    Context provideContext() {
        return context;
    }
}

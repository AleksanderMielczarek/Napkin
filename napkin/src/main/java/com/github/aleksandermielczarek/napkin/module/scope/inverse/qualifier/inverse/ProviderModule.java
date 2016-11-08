package com.github.aleksandermielczarek.napkin.module.scope.inverse.qualifier.inverse;

import android.content.Context;

import com.github.aleksandermielczarek.napkin.qualifier.inverse.ContextProvider;
import com.github.aleksandermielczarek.napkin.scope.inverse.ScopeProvider;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 08.11.2016.
 */
@Module
@ScopeProvider
public class ProviderModule {

    private final Context context;

    public ProviderModule(Context context) {
        this.context = context;
    }

    @Provides
    @ScopeProvider
    @ContextProvider
    Context provideContext() {
        return context;
    }
}

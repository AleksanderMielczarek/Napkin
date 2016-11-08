package com.github.aleksandermielczarek.napkin.module.scope.per;

import android.content.Context;

import com.github.aleksandermielczarek.napkin.qualifier.ProviderContext;
import com.github.aleksandermielczarek.napkin.scope.per.PerProvider;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 08.11.2016.
 */
@Module
@PerProvider
public class ProviderModule {

    private final Context context;

    public ProviderModule(Context context) {
        this.context = context;
    }

    @Provides
    @PerProvider
    @ProviderContext
    Context provideContext() {
        return context;
    }
}

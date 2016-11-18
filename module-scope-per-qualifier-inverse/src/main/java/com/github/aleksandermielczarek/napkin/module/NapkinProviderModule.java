package com.github.aleksandermielczarek.napkin.module;

import android.content.Context;

import com.github.aleksandermielczarek.napkin.qualifier.ContextProvider;
import com.github.aleksandermielczarek.napkin.scope.PerProvider;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 08.11.2016.
 */
@Module
@PerProvider
public class NapkinProviderModule extends AbstractNapkinProviderModule {

    public NapkinProviderModule(Context context) {
        super(context);
    }

    @Override
    @Provides
    @PerProvider
    @ContextProvider
    public Context provideContext() {
        return context;
    }
}

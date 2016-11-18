package com.github.aleksandermielczarek.napkin.module;

import android.content.Context;

import com.github.aleksandermielczarek.napkin.qualifier.ContextProvider;
import com.github.aleksandermielczarek.napkin.scope.ProviderScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 08.11.2016.
 */
@Module
@ProviderScope
public class NapkinProviderModule extends AbstractNapkinProviderModule {

    public NapkinProviderModule(Context context) {
        super(context);
    }

    @Override
    @Provides
    @ProviderScope
    @ContextProvider
    public Context provideContext() {
        return context;
    }

}

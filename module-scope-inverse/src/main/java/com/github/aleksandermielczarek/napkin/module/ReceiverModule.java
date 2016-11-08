package com.github.aleksandermielczarek.napkin.module;

import android.content.Context;

import com.github.aleksandermielczarek.napkin.qualifier.ReceiverContext;
import com.github.aleksandermielczarek.napkin.scope.ScopeReceiver;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 08.11.2016.
 */
@Module
@ScopeReceiver
public class ReceiverModule {

    private final Context context;

    public ReceiverModule(Context context) {
        this.context = context;
    }

    @Provides
    @ScopeReceiver
    @ReceiverContext
    Context provideContext() {
        return context;
    }
}

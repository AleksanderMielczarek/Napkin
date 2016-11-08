package com.github.aleksandermielczarek.napkin.module.scope.inverse.qualifier.inverse;

import android.content.Context;

import com.github.aleksandermielczarek.napkin.qualifier.inverse.ContextReceiver;
import com.github.aleksandermielczarek.napkin.scope.inverse.ScopeReceiver;

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
    @ContextReceiver
    Context provideContext() {
        return context;
    }
}

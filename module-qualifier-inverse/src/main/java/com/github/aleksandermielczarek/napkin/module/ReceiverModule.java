package com.github.aleksandermielczarek.napkin.module;

import android.content.Context;

import com.github.aleksandermielczarek.napkin.qualifier.ContextReceiver;
import com.github.aleksandermielczarek.napkin.scope.ReceiverScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 08.11.2016.
 */
@Module
@ReceiverScope
public class ReceiverModule {

    private final Context context;

    public ReceiverModule(Context context) {
        this.context = context;
    }

    @Provides
    @ReceiverScope
    @ContextReceiver
    Context provideContext() {
        return context;
    }
}

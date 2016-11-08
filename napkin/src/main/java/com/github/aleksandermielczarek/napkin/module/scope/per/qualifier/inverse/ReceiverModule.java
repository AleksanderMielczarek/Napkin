package com.github.aleksandermielczarek.napkin.module.scope.per.qualifier.inverse;

import android.content.Context;

import com.github.aleksandermielczarek.napkin.qualifier.inverse.ContextReceiver;
import com.github.aleksandermielczarek.napkin.scope.per.PerReceiver;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 08.11.2016.
 */
@Module
@PerReceiver
public class ReceiverModule {

    private final Context context;

    public ReceiverModule(Context context) {
        this.context = context;
    }

    @Provides
    @PerReceiver
    @ContextReceiver
    Context provideContext() {
        return context;
    }
}

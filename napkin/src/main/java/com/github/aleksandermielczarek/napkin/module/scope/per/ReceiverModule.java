package com.github.aleksandermielczarek.napkin.module.scope.per;

import android.content.Context;

import com.github.aleksandermielczarek.napkin.qualifier.ReceiverContext;
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
    @ReceiverContext
    Context provideContext() {
        return context;
    }
}

package com.github.aleksandermielczarek.napkin.module;

import android.content.Context;

import com.github.aleksandermielczarek.napkin.qualifier.ContextReceiver;
import com.github.aleksandermielczarek.napkin.scope.PerReceiver;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 08.11.2016.
 */
@Module
@PerReceiver
public class NapkinReceiverModule extends AbstractNapkinReceiverModule {

    public NapkinReceiverModule(Context context) {
        super(context);
    }

    @Override
    @Provides
    @PerReceiver
    @ContextReceiver
    public Context provideContext() {
        return context;
    }
}

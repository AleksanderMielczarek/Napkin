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
public class NapkinReceiverModule extends AbstractNapkinReceiverModule {

    public NapkinReceiverModule(Context context) {
        super(context);
    }

    @Override
    @Provides
    @ReceiverScope
    @ContextReceiver
    public Context provideContext() {
        return context;
    }
}

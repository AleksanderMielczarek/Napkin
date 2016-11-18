package com.github.aleksandermielczarek.napkin.module;

import android.content.Context;

import com.github.aleksandermielczarek.napkin.qualifier.ContextReceiver;
import com.github.aleksandermielczarek.napkin.scope.ScopeReceiver;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 08.11.2016.
 */
@Module
@ScopeReceiver
public class NapkinReceiverModule extends AbstractNapkinReceiverModule {

    public NapkinReceiverModule(Context context) {
        super(context);
    }

    @Override
    @Provides
    @ScopeReceiver
    @ContextReceiver
    public Context provideContext() {
        return context;
    }
}

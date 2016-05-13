package com.github.aleksandermielczarek.napkinexample;

import android.content.Context;

import com.github.aleksandermielczarek.napkin.qualifier.AppContext;
import com.github.aleksandermielczarek.napkin.scope.AppScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 13.05.2016.
 */
@Module
@AppScope
public class AppModule {

    private final Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    String provideNapkinString() {
        return "Hello Napkin!";
    }

    @AppContext
    @Provides
    Context provideContext() {
        return context;
    }
}

package com.github.aleksandermielczarek.napkin.module;

import android.content.Context;

import com.github.aleksandermielczarek.napkin.qualifier.ServiceContext;
import com.github.aleksandermielczarek.napkin.scope.PerService;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 08.11.2016.
 */
@Module
@PerService
public class NapkinServiceModule extends AbstractNapkinServiceModule {

    public NapkinServiceModule(Context context) {
        super(context);
    }

    @Override
    @Provides
    @PerService
    @ServiceContext
    public Context provideContext() {
        return context;
    }
}

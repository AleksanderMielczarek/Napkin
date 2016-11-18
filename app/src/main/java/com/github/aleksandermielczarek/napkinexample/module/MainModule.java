package com.github.aleksandermielczarek.napkinexample.module;

import android.app.Application;

import com.github.aleksandermielczarek.napkin.module.AppModule;
import com.github.aleksandermielczarek.napkin.scope.AppScope;
import com.github.aleksandermielczarek.napkinexample.qualifier.AppString;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 13.05.2016.
 */
@Module
@AppScope
public class MainModule extends AppModule {

    public MainModule(Application application) {
        super(application);
    }

    @Provides
    @AppString
    String provideNapkinString() {
        return "Hello Napkin in App!";
    }

}

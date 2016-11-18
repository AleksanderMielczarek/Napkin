package com.github.aleksandermielczarek.napkinexample.module;

import android.support.v7.app.AppCompatActivity;

import com.github.aleksandermielczarek.napkin.module.NapkinActivityModule;
import com.github.aleksandermielczarek.napkin.scope.ActivityScope;
import com.github.aleksandermielczarek.napkinexample.qualifier.ActivityString;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 18.11.2016.
 */
@Module
@ActivityScope
public class ActivityModule extends NapkinActivityModule {

    public ActivityModule(AppCompatActivity activity) {
        super(activity);
    }

    @Provides
    @ActivityString
    String provideNapkinString() {
        return "Hello Napkin in Activity!";
    }
}

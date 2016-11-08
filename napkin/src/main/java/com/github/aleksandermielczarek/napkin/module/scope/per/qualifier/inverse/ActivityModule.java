package com.github.aleksandermielczarek.napkin.module.scope.per.qualifier.inverse;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.github.aleksandermielczarek.napkin.qualifier.inverse.ContextActivity;
import com.github.aleksandermielczarek.napkin.scope.per.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 08.11.2016.
 */
@Module
@PerActivity
public class ActivityModule {

    private final AppCompatActivity activity;

    public ActivityModule(AppCompatActivity activity) {
        this.activity = activity;
    }

    @Provides
    @PerActivity
    AppCompatActivity provideActivity() {
        return activity;
    }

    @Provides
    @PerActivity
    @ContextActivity
    Context provideContext() {
        return activity;
    }
}

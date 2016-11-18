package com.github.aleksandermielczarek.napkin.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.github.aleksandermielczarek.napkin.qualifier.ContextActivity;
import com.github.aleksandermielczarek.napkin.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 08.11.2016.
 */
@Module
@ActivityScope
public class NapkinActivityModule extends AbstractNapkinActivityModule {

    public NapkinActivityModule(AppCompatActivity activity) {
        super(activity);
    }

    @Override
    @Provides
    @ActivityScope
    public AppCompatActivity provideActivity() {
        return activity;
    }

    @Override
    @Provides
    @ActivityScope
    @ContextActivity
    public Context provideContext() {
        return activity;
    }
}

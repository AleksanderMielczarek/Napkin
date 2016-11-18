package com.github.aleksandermielczarek.napkin.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.github.aleksandermielczarek.napkin.qualifier.ContextActivity;
import com.github.aleksandermielczarek.napkin.scope.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 08.11.2016.
 */
@Module
@PerActivity
public class NapkinActivityModule extends AbstractNapkinActivityModule {

    public NapkinActivityModule(AppCompatActivity activity) {
        super(activity);
    }

    @Override
    @Provides
    @PerActivity
    public AppCompatActivity provideActivity() {
        return activity;
    }

    @Override
    @Provides
    @PerActivity
    @ContextActivity
    public Context provideContext() {
        return activity;
    }
}

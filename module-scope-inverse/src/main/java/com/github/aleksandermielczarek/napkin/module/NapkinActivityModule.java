package com.github.aleksandermielczarek.napkin.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.github.aleksandermielczarek.napkin.qualifier.ActivityContext;
import com.github.aleksandermielczarek.napkin.scope.ScopeActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aleksander Mielczarek on 08.11.2016.
 */
@Module
@ScopeActivity
public class NapkinActivityModule extends AbstractNapkinActivityModule{

    public NapkinActivityModule(AppCompatActivity activity) {
        super(activity);
    }

    @Override
    @Provides
    @ScopeActivity
    public AppCompatActivity provideActivity() {
        return activity;
    }

    @Override
    @Provides
    @ScopeActivity
    @ActivityContext
    public Context provideContext() {
        return activity;
    }
}

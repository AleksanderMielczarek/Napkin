package com.github.aleksandermielczarek.napkinexample;

import android.app.Application;

import com.github.aleksandermielczarek.napkin.ComponentProvider;
import com.github.aleksandermielczarek.napkinexample.component.AppComponent;
import com.github.aleksandermielczarek.napkinexample.component.DaggerAppComponent;
import com.github.aleksandermielczarek.napkinexample.module.MainModule;

/**
 * Created by Aleksander Mielczarek on 13.05.2016.
 */
public class NapkinApplication extends Application implements ComponentProvider<AppComponent> {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .mainModule(new MainModule(this))
                .build();
    }

    @Override
    public AppComponent provideComponent() {
        return appComponent;
    }

}

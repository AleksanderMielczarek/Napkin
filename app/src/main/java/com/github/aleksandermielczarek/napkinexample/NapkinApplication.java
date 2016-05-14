package com.github.aleksandermielczarek.napkinexample;

import android.app.Application;
import android.content.Context;

import com.github.aleksandermielczarek.napkin.ComponentProvider;
import com.github.aleksandermielczarek.napkin.Napkin;

/**
 * Created by Aleksander Mielczarek on 13.05.2016.
 */
public class NapkinApplication extends Application implements ComponentProvider<AppComponent> {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    @Override
    public AppComponent provideComponent() {
        return appComponent;
    }

    public static AppComponent provideAppComponent(Context context) {
        return Napkin.provideComponent(context);
    }
}

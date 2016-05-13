package com.github.aleksandermielczarek.napkinexample;

import android.app.Application;

/**
 * Created by Aleksander Mielczarek on 13.05.2016.
 */
public class NapkinApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}

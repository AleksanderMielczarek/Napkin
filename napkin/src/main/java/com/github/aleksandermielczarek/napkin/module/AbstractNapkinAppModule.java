package com.github.aleksandermielczarek.napkin.module;

import android.app.Application;

/**
 * Created by Aleksander Mielczarek on 18.11.2016.
 */

abstract class AbstractNapkinAppModule implements NapkinAppModuleProvider {

    protected final Application application;

    public AbstractNapkinAppModule(Application application) {
        this.application = application;
    }

}

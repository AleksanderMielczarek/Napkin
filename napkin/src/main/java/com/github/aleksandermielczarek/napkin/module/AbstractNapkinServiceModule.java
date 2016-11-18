package com.github.aleksandermielczarek.napkin.module;

import android.content.Context;

/**
 * Created by Aleksander Mielczarek on 18.11.2016.
 */

abstract class AbstractNapkinServiceModule implements NapkinServiceModuleProvider {

    protected final Context context;

    public AbstractNapkinServiceModule(Context context) {
        this.context = context;
    }

}

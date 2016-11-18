package com.github.aleksandermielczarek.napkin.module;

import android.content.Context;

/**
 * Created by Aleksander Mielczarek on 18.11.2016.
 */

abstract class AbstractNapkinProviderModule implements NapkinProviderModuleProvider {

    protected final Context context;

    public AbstractNapkinProviderModule(Context context) {
        this.context = context;
    }

}

package com.github.aleksandermielczarek.napkin.module;

import android.content.Context;

/**
 * Created by Aleksander Mielczarek on 18.11.2016.
 */

abstract class AbstractNapkinReceiverModule implements NapkinReceiverModuleProvider {

    protected final Context context;

    public AbstractNapkinReceiverModule(Context context) {
        this.context = context;
    }

}

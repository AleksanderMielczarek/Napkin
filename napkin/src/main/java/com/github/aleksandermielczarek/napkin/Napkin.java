package com.github.aleksandermielczarek.napkin;

import android.content.Context;

/**
 * Created by Aleksander Mielczarek on 14.05.2016.
 */
public class Napkin {

    private Napkin() {

    }

    public static <T> T provideComponent(Context context) {
        Context applicationContext = context.getApplicationContext();
        ComponentProvider<T> componentProvider = (ComponentProvider<T>) applicationContext;
        return componentProvider.provideComponent();
    }

}

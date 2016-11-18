package com.github.aleksandermielczarek.napkin;

import android.content.Context;
import android.support.v4.app.Fragment;

/**
 * Created by Aleksander Mielczarek on 14.05.2016.
 */
public class Napkin {

    private Napkin() {

    }

    private static <T> T provideComponent(Object object) {
        ComponentProvider<T> componentProvider = (ComponentProvider<T>) object;
        return componentProvider.provideComponent();
    }

    public static <T> T provideAppComponent(Context context) {
        Context application = context.getApplicationContext();
        return provideComponent(application);
    }

    public static <T> T provideAppComponent(Fragment fragment) {
        Context application = fragment.getContext().getApplicationContext();
        return provideComponent(application);
    }

    public static <T> T provideActivityComponent(Fragment fragment) {
        Context activity = fragment.getActivity();
        return provideComponent(activity);
    }

}

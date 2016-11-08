package com.github.aleksandermielczarek.napkinexample;

import dagger.Component;

/**
 * Created by Aleksander Mielczarek on 13.05.2016.
 */
@ActivityScope
@Component(dependencies = AppComponent.class)
public interface MainComponent {

    void inject(MainActivity mainActivity);
}

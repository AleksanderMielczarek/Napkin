package com.github.aleksandermielczarek.napkinexample.component;

import com.github.aleksandermielczarek.napkin.module.ActivityModule;
import com.github.aleksandermielczarek.napkin.scope.ActivityScope;
import com.github.aleksandermielczarek.napkinexample.ui.MainActivity;

import dagger.Subcomponent;

/**
 * Created by Aleksander Mielczarek on 13.05.2016.
 */
@ActivityScope
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);
}

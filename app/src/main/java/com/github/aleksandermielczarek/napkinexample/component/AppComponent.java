package com.github.aleksandermielczarek.napkinexample.component;

import com.github.aleksandermielczarek.napkin.module.ActivityModule;
import com.github.aleksandermielczarek.napkin.scope.AppScope;
import com.github.aleksandermielczarek.napkinexample.module.MainModule;

import dagger.Component;

/**
 * Created by Aleksander Mielczarek on 13.05.2016.
 */
@Component(modules = MainModule.class)
@AppScope
public interface AppComponent {

    ActivityComponent with(ActivityModule activityModule);
}

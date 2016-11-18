package com.github.aleksandermielczarek.napkinexample.component;


import com.github.aleksandermielczarek.napkin.scope.AppScope;
import com.github.aleksandermielczarek.napkinexample.module.ActivityModule;
import com.github.aleksandermielczarek.napkinexample.module.AppModule;

import dagger.Component;

/**
 * Created by Aleksander Mielczarek on 13.05.2016.
 */
@Component(modules = AppModule.class)
@AppScope
public interface AppComponent {

    ActivityComponent with(ActivityModule activityModule);
}

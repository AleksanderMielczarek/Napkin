package com.github.aleksandermielczarek.napkinexample.component;

import com.github.aleksandermielczarek.napkin.scope.FragmentScope;
import com.github.aleksandermielczarek.napkinexample.module.FragmentModule;
import com.github.aleksandermielczarek.napkinexample.ui.SecondaryFragment;

import dagger.Subcomponent;

/**
 * Created by Aleksander Mielczarek on 18.11.2016.
 */
@FragmentScope
@Subcomponent(modules = FragmentModule.class)
public interface FragmentComponent {

    void inject(SecondaryFragment secondaryFragment);
}

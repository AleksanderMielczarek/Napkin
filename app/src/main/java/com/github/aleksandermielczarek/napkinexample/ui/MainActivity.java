package com.github.aleksandermielczarek.napkinexample.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.github.aleksandermielczarek.napkin.ComponentProvider;
import com.github.aleksandermielczarek.napkin.Napkin;
import com.github.aleksandermielczarek.napkinexample.R;
import com.github.aleksandermielczarek.napkinexample.component.ActivityComponent;
import com.github.aleksandermielczarek.napkinexample.component.AppComponent;
import com.github.aleksandermielczarek.napkinexample.databinding.ActivityMainBinding;
import com.github.aleksandermielczarek.napkinexample.module.ActivityModule;

import javax.inject.Inject;

/**
 * Created by Aleksander Mielczarek on 13.05.2016.
 */
public class MainActivity extends AppCompatActivity implements ComponentProvider<ActivityComponent> {

    @Inject
    protected MainViewModel mainViewModel;

    private ActivityComponent activityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent = Napkin.<AppComponent>provideAppComponent(this)
                .with(new ActivityModule(this));

        activityComponent.inject(this);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(mainViewModel);
    }

    @Override
    public ActivityComponent provideComponent() {
        return activityComponent;
    }
}

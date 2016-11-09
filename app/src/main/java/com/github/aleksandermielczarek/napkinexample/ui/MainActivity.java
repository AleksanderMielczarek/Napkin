package com.github.aleksandermielczarek.napkinexample.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.github.aleksandermielczarek.napkin.Napkin;
import com.github.aleksandermielczarek.napkin.module.ActivityModule;
import com.github.aleksandermielczarek.napkinexample.R;
import com.github.aleksandermielczarek.napkinexample.component.AppComponent;
import com.github.aleksandermielczarek.napkinexample.databinding.ActivityMainBinding;

import javax.inject.Inject;

/**
 * Created by Aleksander Mielczarek on 13.05.2016.
 */
public class MainActivity extends AppCompatActivity {

    @Inject
    protected MainViewModel mainViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Napkin.<AppComponent>provideComponent(this)
                .with(new ActivityModule(this))
                .inject(this);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(mainViewModel);
    }
}

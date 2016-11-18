package com.github.aleksandermielczarek.napkinexample.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.aleksandermielczarek.napkin.Napkin;
import com.github.aleksandermielczarek.napkinexample.component.ActivityComponent;
import com.github.aleksandermielczarek.napkinexample.databinding.FragmentScondaryBinding;
import com.github.aleksandermielczarek.napkinexample.module.FragmentModule;

import javax.inject.Inject;

/**
 * Created by Aleksander Mielczarek on 18.11.2016.
 */

public class SecondaryFragment extends Fragment {

    @Inject
    protected SecondaryViewModel secondaryViewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Napkin.<ActivityComponent>provideActivityComponent(this)
                .with(new FragmentModule(this))
                .inject(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentScondaryBinding binding = FragmentScondaryBinding.inflate(inflater, container, false);
        binding.setViewModel(secondaryViewModel);
        return binding.getRoot();
    }
}

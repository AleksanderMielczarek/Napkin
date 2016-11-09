package com.github.aleksandermielczarek.napkinexample.ui;

import android.databinding.ObservableField;

import javax.inject.Inject;

/**
 * Created by Aleksander Mielczarek on 09.11.2016.
 */

public class MainViewModel {

    public final ObservableField<String> napkinString = new ObservableField<>();

    @Inject
    public MainViewModel(String napkinString) {
        this.napkinString.set(napkinString);
    }
}

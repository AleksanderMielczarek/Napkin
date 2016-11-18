package com.github.aleksandermielczarek.napkinexample.ui;

import android.databinding.ObservableField;

import com.github.aleksandermielczarek.napkinexample.qualifier.ActivityString;
import com.github.aleksandermielczarek.napkinexample.qualifier.AppString;
import com.github.aleksandermielczarek.napkinexample.qualifier.FragmentString;

import javax.inject.Inject;

/**
 * Created by Aleksander Mielczarek on 18.11.2016.
 */

public class SecondaryViewModel {

    public final ObservableField<String> napkinString = new ObservableField<>();
    public final ObservableField<String> napkinString2 = new ObservableField<>();
    public final ObservableField<String> napkinString3 = new ObservableField<>();

    @Inject
    public SecondaryViewModel(@AppString String napkinString, @ActivityString String napkinString2, @FragmentString String napkinString3) {
        this.napkinString.set(napkinString);
        this.napkinString2.set(napkinString2);
        this.napkinString3.set(napkinString3);
    }
}

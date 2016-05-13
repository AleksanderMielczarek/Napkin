package com.github.aleksandermielczarek.napkinexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

/**
 * Created by Aleksander Mielczarek on 13.05.2016.
 */
public class MainActivity extends AppCompatActivity {

    @Inject
    protected String napkinString;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        NapkinApplication napkinApplication = (NapkinApplication) getApplicationContext();
        DaggerMainComponent.builder()
                .appComponent(napkinApplication.getAppComponent())
                .build()
                .inject(this);

        setContentView(R.layout.activity_main);

        TextView napkinView = (TextView) findViewById(R.id.napkinText);
        napkinView.setText(napkinString);
    }
}

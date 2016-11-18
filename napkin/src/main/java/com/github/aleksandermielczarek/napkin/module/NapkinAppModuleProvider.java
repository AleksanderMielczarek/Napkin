package com.github.aleksandermielczarek.napkin.module;

import android.app.Application;
import android.content.Context;

/**
 * Created by Aleksander Mielczarek on 18.11.2016.
 */

interface NapkinAppModuleProvider {

    Application provideApplication();

    Context provideContext();
}

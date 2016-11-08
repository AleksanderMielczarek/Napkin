package com.github.aleksandermielczarek.napkin.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by Aleksander Mielczarek on 13.05.2016.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerUser {
}

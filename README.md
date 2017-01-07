[![](https://jitpack.io/v/AleksanderMielczarek/Napkin.svg)](https://jitpack.io/#AleksanderMielczarek/Napkin)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Napkin-brightgreen.svg?style=flat)](http://android-arsenal.com/details/1/4676)

# Napkin

![Logo](images/logo.png)

Common scopes, qualifiers and few utilities for [Dagger 2](http://google.github.io/dagger/).
Scopes and qualifiers can be used also with [toothpick](https://github.com/stephanenicolas/toothpick).

## Usage

Add it in your root build.gradle at the end of repositories:

```groovy
allprojects {
	repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```

## Core

Add the dependency

```groovy
dependencies {
    compile 'com.github.AleksanderMielczarek.Napkin:napkin:0.7.0'
}
```

- with Napkin you have easy access to Component in Application

```java
public class MyApplication extends Application implements ComponentProvider<AppComponent> {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    @Override
    public AppComponent provideComponent() {
        return appComponent;
    }

}
```

```java
DaggerMainComponent.builder()
                .appComponent(Napkin.<AppComponent>provideAppComponent(context))
                .build()
                .inject(this);
```
   
- in case you just need component you can use:

```java
AppComponent appComponent = Napkin.<AppComponent>provideAppComponent(context);
```

- with [Retrolambda](https://github.com/evant/gradle-retrolambda) you can use:

```java
DaggerMainComponent.builder()
                .appComponent(Napkin.provideAppComponent(context))
                .build()
                .inject(this);
                
AppComponent appComponent = Napkin.provideAppComponent(context);
```

- access component stored in any class implementing ComponentProvider<T>

```java
Component component = Napkin.<Component>provideComponent(object);
```

- access component stored in Application class implementing ComponentProvider<T> by any Context

```java
Component component = Napkin.<Component>provideAppComponent(context);
```

- access component stored in Application class implementing ComponentProvider<T> by Fragment

```java
Component component = Napkin.<Component>provideAppComponent(fragment);
```

- access component stored in Application class implementing ComponentProvider<T> by View

```java
Component component = Napkin.<Component>provideAppComponent(view);
```

- access component stored in Activity class implementing ComponentProvider<T> by Fragment

```java
Component component = Napkin.<Component>provideActivityComponent(fragment);
```

- access component stored in Activity class implementing ComponentProvider<T> by View

```java
Component component = Napkin.<Component>provideActivityComponent(view);
```

- you can use Napkin with sub components:

```java
@AppScope
@Component(modules = AppModule.class)
public interface AppComponent {
   
    ActivityComponent with(ActivityModule activityModule);
 
}
```

```java
@ActivityScope
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    FragmentComponent with(FragmentModule fragmentModule);

    void inject(MyActivity myActivity);
}
```

```java
@FragmentScope
@Subcomponent(modules = FragmentModule.class)
public interface FragmentComponent {

    void inject(MyFragment myFragment);
}
```

```java
public class MyApplication extends Application implements ComponentProvider<AppComponent> {
  
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
   
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();      
    }

    @Override
    public AppComponent provideComponent() {
        return appComponent;
    }
}
```

```java
public class MyActivity extends AppCompatActivity implements ComponentProvider<ActivityComponent> {
  
    private ActivityComponent activityComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        activityComponent = Napkin.<AppComponent>provideAppComponent(this)
                .with(new ActivityModule(this));
        activityComponent.inject(this);
    }

    @Override
    public ActivityComponent provideComponent() {
        return activityComponent;
    }
}
```

```java
public class MyFragment extends Fragment {
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Napkin.<ActivityComponent>provideActivityComponent(this)
                .with(new FragmentModule(this))
                .inject(this);
    }   
}
```

## Common qualifiers

Add the dependency

```groovy
dependencies {
    compile 'com.github.AleksanderMielczarek.Napkin:qualifier-common:0.7.0'
}
```

- list of annotations

```java
@RestEndpoint
```

## Scopes

Add the dependency

```groovy
dependencies {
    compile 'com.github.AleksanderMielczarek.Napkin:scope:0.7.0'
}
```

- list of annotations

```java
@AppScope
@ActivityScope
@FragmentScope
@ServiceScope
@ReceiverScope
@ProviderScope
@UserScope
@SessionScope
```

## Qualifiers

Add the dependency

```groovy
dependencies {
    compile 'com.github.AleksanderMielczarek.Napkin:qualifier:0.7.0'
}
```

- list of annotations

```java
@AppContext 
@ActivityContext
@FragmentContext
@ServiceContext
@ReceiverContext
@ProviderContext
```

## Modules

Add the dependency

```groovy
dependencies {
    compile 'com.github.AleksanderMielczarek.Napkin:module:0.7.0'
}
```

Napkin modules can be override to add custom methods.

- list of modules

```java
@Module
@AppScope
public class NapkinAppModule extends AbstractNapkinAppModule {

    public NapkinAppModule(Application application) {
        super(application);
    }

    @Override
    @Provides
    @AppScope
    public Application provideApplication() {
        return application;
    }

    @Override
    @Provides
    @AppScope
    @AppContext
    public Context provideContext() {
        return application;
    }
}
```

```java
@Module
@ActivityScope
public class NapkinActivityModule extends AbstractNapkinActivityModule {

    public NapkinActivityModule(AppCompatActivity activity) {
        super(activity);
    }

    @Override
    @Provides
    @ActivityScope
    public AppCompatActivity provideActivity() {
        return activity;
    }

    @Override
    @Provides
    @ActivityScope
    @ActivityContext
    public Context provideContext() {
        return activity;
    }
}
```

```java
@Module
@FragmentScope
public class NapkinFragmentModule extends AbstractNapkinFragmentModule {

    public NapkinFragmentModule(Fragment fragment) {
        super(fragment);
    }

    @Override
    @Provides
    @FragmentScope
    public Fragment provideFragment() {
        return fragment;
    }

}
```

```java
@Module
@ServiceScope
public class NapkinServiceModule extends AbstractNapkinServiceModule {

    public NapkinServiceModule(Context context) {
        super(context);
    }

    @Override
    @Provides
    @ServiceScope
    @ServiceContext
    public Context provideContext() {
        return context;
    }
}

```

```java
@Module
@ReceiverScope
public class NapkinReceiverModule extends AbstractNapkinReceiverModule {

    public NapkinReceiverModule(Context context) {
        super(context);
    }

    @Override
    @Provides
    @ReceiverScope
    @ReceiverContext
    public Context provideContext() {
        return context;
    }
}
```

```java
@Module
@ProviderScope
public class NapkinProviderModule extends AbstractNapkinProviderModule {

    public NapkinProviderModule(Context context) {
        super(context);
    }

    @Override
    @Provides
    @ProviderScope
    @ProviderContext
    public Context provideContext() {
        return context;
    }
}
```

## Scopes with prefix Per

Add the dependency

```groovy
dependencies {
    compile 'com.github.AleksanderMielczarek.Napkin:scope-per:0.7.0'
}
```

- list of annotations

```java
@PerApp
@PerActivity
@PerFragment
@PerService
@PerReceiver
@PerProvider
@PerUser
@PerSession
```

## Scopes with inverted names

Add the dependency

```groovy
dependencies {
    compile 'com.github.AleksanderMielczarek.Napkin:scope-inverse:0.7.0'
}
```

- list of annotations

```java
@ScopeApp
@ScopeActivity
@ScopeFragment
@ScopeService
@ScopeReceiver
@ScopeProvider
@ScopeUser
@ScopeSession
```

## Qualifiers with inverted names

Add the dependency

```groovy
dependencies {
    compile 'com.github.AleksanderMielczarek.Napkin:qualifier-inverse:0.7.0'
}
```

- list of annotations

```java
@ContextApp 
@ContextActivity
@ContextFragment
@ContextService
@ContextReceiver
@ContextProvider
```

## Modules with scopes with prefix Per

Add the dependency

```groovy
dependencies {
    compile 'com.github.AleksanderMielczarek.Napkin:module-scope-per:0.7.0'
}
```

## Modules with scopes with inverted names

Add the dependency

```groovy
dependencies {
    compile 'com.github.AleksanderMielczarek.Napkin:module-scope-inverse:0.7.0'
}
```

## Modules with qualifiers with inverted names

Add the dependency

```groovy
dependencies {
    compile 'com.github.AleksanderMielczarek.Napkin:module-qualifier-inverse:0.7.0'
}
```

## Modules with scopes with prefix Per and qualifiers with inverted names

Add the dependency

```groovy
dependencies {
    compile 'com.github.AleksanderMielczarek.Napkin:module-scope-per-qualifier-inverse:0.7.0'
}
```

## Modules with scopes with inverted names and qualifiers with inverted names

Add the dependency

```groovy
dependencies {
    compile 'com.github.AleksanderMielczarek.Napkin:module-scope-inverse-qualifier-inverse:0.7.0'
}
```

## Changelog

### 0.7.0 (2017-01-07)

- remove Dagger 2 dependency from scopes and qualifiers
- move common qualifiers to separate sub project
- update dependencies

### 0.6.1 (2016-12-01)

- update dependencies

### 0.6.0 (2016-11-18)

- rename modules 
- changes in methods for providing component

### 0.5.0 (2016-11-11)

- split into sub projects 
- add modules

### 0.4.0 (2016-10-31)

- add new annotations
- delete method for retrieving component by Class<T>

### 0.3.0 (2016-10-25)

- update SDK
- add new method for retrieve component

### 0.2.1 (2016-09-14)

- update SDK

### 0.2.0 (2016-05-14)

- add component provider
- add new annotation

### 0.1.1 (2016-05-13)

- add new annotations
 
## License

    Copyright 2016 Aleksander Mielczarek

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

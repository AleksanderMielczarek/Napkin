[![](https://jitpack.io/v/AleksanderMielczarek/Napkin.svg)](https://jitpack.io/#AleksanderMielczarek/Napkin)

# Napkin

![Logo](images/logo.png)

Common scopes, qualifiers and few utilities for [Dagger 2](http://google.github.io/dagger/).

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
    compile 'com.github.AleksanderMielczarek.Napkin:napkin:0.5.0'
}
```

- common qualifiers

```java
@RestEndpoint
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
                .appComponent(Napkin.<AppComponent>provideComponent(context))
                .build()
                .inject(this);
```
   
- in case you just need component you can use:

```java
AppComponent appComponent = Napkin.<AppComponent>provideComponent(context);
```

- with [Retrolambda](https://github.com/evant/gradle-retrolambda) you can use:

```java
DaggerMainComponent.builder()
                .appComponent(Napkin.provideComponent())
                .build()
                .inject(this);
```

## Scopes

Add the dependency

```groovy
dependencies {
    compile 'com.github.AleksanderMielczarek.Napkin:scope:0.5.0'
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
    compile 'com.github.AleksanderMielczarek.Napkin:qualifier:0.5.0'
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
    compile 'com.github.AleksanderMielczarek.Napkin:module:0.5.0'
}
```

- list of modules

```java
@Module
@AppScope
public class AppModule {

    private final Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @AppScope
    Application provideApplication() {
        return application;
    }

    @Provides
    @AppScope
    @AppContext
    Context provideContext() {
        return application;
    }
}
```

```java
@Module
@ActivityScope
public class ActivityModule {

    private final AppCompatActivity activity;

    public ActivityModule(AppCompatActivity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityScope
    AppCompatActivity provideActivity() {
        return activity;
    }

    @Provides
    @ActivityScope
    @ActivityContext
    Context provideContext() {
        return activity;
    }
}
```

```java
@Module
@FragmentScope
public class FragmentModule {

    private final Fragment fragment;

    public FragmentModule(Fragment fragment) {
        this.fragment = fragment;
    }

    @Provides
    @FragmentScope
    Fragment provideFragment() {
        return fragment;
    }
}
```

```java
@Module
@ServiceScope
public class ServiceModule {

    private final Context context;

    public ServiceModule(Context context) {
        this.context = context;
    }

    @Provides
    @ServiceScope
    @ServiceContext
    Context provideContext() {
        return context;
    }
}
```

```java
@Module
@ReceiverScope
public class ReceiverModule {

    private final Context context;

    public ReceiverModule(Context context) {
        this.context = context;
    }

    @Provides
    @ReceiverScope
    @ReceiverContext
    Context provideContext() {
        return context;
    }
}
```

```java
@Module
@ProviderScope
public class ProviderModule {

    private final Context context;

    public ProviderModule(Context context) {
        this.context = context;
    }

    @Provides
    @ProviderScope
    @ProviderContext
    Context provideContext() {
        return context;
    }
}
```

## Scopes with prefix Per

Add the dependency

```groovy
dependencies {
    compile 'com.github.AleksanderMielczarek.Napkin:scope-per:0.5.0'
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
    compile 'com.github.AleksanderMielczarek.Napkin:scope-inverse:0.5.0'
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
    compile 'com.github.AleksanderMielczarek.Napkin:qualifier-inverse:0.5.0'
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
    compile 'com.github.AleksanderMielczarek.Napkin:module-scope-per:0.5.0'
}
```

## Modules with scopes with inverted names

Add the dependency

```groovy
dependencies {
    compile 'com.github.AleksanderMielczarek.Napkin:module-scope-inverse:0.5.0'
}
```

## Modules with qualifiers with inverted names

Add the dependency

```groovy
dependencies {
    compile 'com.github.AleksanderMielczarek.Napkin:module-qualifier-inverse:0.5.0'
}
```

## Modules with scopes with prefix Per and qualifiers with inverted names

Add the dependency

```groovy
dependencies {
    compile 'com.github.AleksanderMielczarek.Napkin:module-scope-per-qualifier-inverse:0.5.0'
}
```

## Modules with scopes with inverted names and qualifiers with inverted names

Add the dependency

```groovy
dependencies {
    compile 'com.github.AleksanderMielczarek.Napkin:module-scope-inverse-qualifier-inverse:0.5.0'
}
```

## Changelog

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
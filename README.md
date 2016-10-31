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

Add the dependency

```groovy
dependencies {
    compile 'com.github.AleksanderMielczarek:Napkin:0.4.0'
}
```

## List of annotations

- qualifiers

```java
@AppContext 
@ActivityContext
@FragmentContext
@ServiceContext
@ReceiverContext
@ProviderContext
@RestEndpoint

@ContextApp 
@ContextActivity
@ContextFragment
@ContextService
@ContextReceiver
@ContextProvider
```

- scopes

```java
@AppScope
@ActivityScope
@FragmentScope
@ServiceScope
@ReceiverScope
@ProviderScope
@UserScope
@SessionScope

@ScopeApp
@ScopeActivity
@ScopeFragment
@ScopeService
@ScopeReceiver
@ScopeProvider
@ScopeUser
@ScopeSession

@PerApp
@PerActivity
@PerFragment
@PerService
@PerReceiver
@PerProvider
@PerUser
@PerSession
```

## Utilities

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

## Changelog

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

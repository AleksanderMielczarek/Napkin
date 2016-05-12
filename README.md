[![](https://jitpack.io/v/AleksanderMielczarek/Napkin.svg)](https://jitpack.io/#AleksanderMielczarek/Napkin)

# Napkin

Common scopes and qualifiers for [Dagger 2](http://google.github.io/dagger/).

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
    compile 'com.github.AleksanderMielczarek:Napkin:0.1.0'
}
```

## List of annotations

* qualifiers

```java
@AppContext 
@ActivityContext
```

* scopes

```java
@AppScope
@ActivityScope
@FragmentScope
@ServiceScope
@ReceiverScope
@ProviderScope
```

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
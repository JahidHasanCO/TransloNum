# TransloNum

TransloNum is an Android Studio Library. This library Translate or Convert English Number Digits to Hindi, Arabic, Bangla Number Digits.
[![](https://jitpack.io/v/JahidHasanCO/TransloNum.svg)](https://jitpack.io/#JahidHasanCO/TransloNum)


**Country Code**
 -  AR/ar (Arabic)
 -  BN/bn (Bangla)
 -  HI/hi (Hindi) 

# Usage

```XML
    <TextView
        android:id="@+id/textSample"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text=""
        android:textSize="20sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/textSample2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text=""
        android:layout_marginTop="10dp"
        android:textSize="20sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textSample" />
```

```kotlin
	val textSample:TextView = findViewById(R.id.textSample)
        val textSample2:TextView = findViewById(R.id.textSample2)

        val number:String = TransloNum.getDigitFromEnglish("103435445","ar")
        val currency:String = TransloNum.convertCountryCurrency(12323.2342,"hi")

        textSample.text = number
        textSample2.text = currency
```

How to get a Git project into your build:

> Step 1. Add the JitPack repository to your build file

# Gradle
Add it in your root build.gradle at the end of repositories:

```
  allprojects {
		repositories {
			
			maven { url 'https://jitpack.io' }
		}
	}
 ```

# Dependencies

```
  dependencies {
	      implementation 'com.github.JahidHasanCO:TransloNum:0.1.0'
	}
```

Changelog
---------
* **0.1.1**
    * Initial release

License
-------

    Copyright 2014 - 2020 Henning Dodenhof

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

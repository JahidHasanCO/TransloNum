# TransloNum

<p align="center">
  <img src="https://github.com/JahidHasanCO/TransloNum/blob/master/ART/cover.jpg" />
</p>

TransloNum is an Android Studio Library. This library Translate or Convert English Numerical digits to Hindi, Arabic, Bangla Numerical digits Also you can convert Hindi, Arabic, Bangla Numerical digit to English Numerical digit. 
[![](https://jitpack.io/v/JahidHasanCO/TransloNum.svg)](https://jitpack.io/#JahidHasanCO/TransloNum)


**Country Code**
 -  AR/ar (Arabic)
 -  BN/bn (Bangla)
 -  HI/hi (Hindi) 
 
 **By Using those Country Code you can transform those countries Numerical digit**
 
 # ScreenShot
 
<p align="center">
  <img src="https://github.com/JahidHasanCO/TransloNum/blob/master/ART/Screenshot_20210728-161700.png" width="290" height="590"/>
</p>

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
You can get Any Numerical digit by Using getDigitFromEnglish() Method. This method required 2 parameters:
	1. Number as a String
	2. Country Code.
same as you can convert currency....

```kotlin
	val textSample:TextView = findViewById(R.id.textSample)
        val textSample2:TextView = findViewById(R.id.textSample2)

        val number:String = TransloNum.getDigitFromEnglish("103435445","ar")
        val currency:String = TransloNum.convertCountryCurrency(12323.2342,"hi")

        textSample.text = number
        textSample2.text = currency
```

Also you can get English Numerical digit by Using this Method.

```kotlin
 
	val number:String = TransloNum.getEnglishDigitFrom("২১৩৪১২৪ ","bn")
      
```

# Gradle
How to get a Git project into your build:
> Step 1. Add the JitPack repository to your build file
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
* **0.1.3**
    * Add getEnglishDigitFrom() method for get English Numerical digit from any countries Numerical digit
    * Improve getDigitFromEnglish() method.
* **0.1.1**
    * Initial release

License
-------

    Copyright 2021 Md. Zahidul islam

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

# BrownianMotionAndroid
An android app that draws particles undergoing brownian motion on tap. 

### current state of project

understanding java


# java

```Java
package com.example.brownianmotionandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
```

alright, one thing at the time

## `package` keyword

> package is a Java keyword. It declares a 'name space' for the Java class. It must be put at the top of the Java file, it should be the first Java statement line. To ensure that the package name will be unique across vendors, usually the company url is used starting in backword.

pretty unique stuff I would say

## the `androidx.appcompat.app.AppCompatActivity` class

https://developer.android.com/reference/androidx/appcompat/app/AppCompatActivity

## `protected` keyword

> Once a variable or a method is marked as protected, it can only be accessed by the below methods:
> 
> - Inside the same class in which it is declared. <------------ so like `private`
> - From other classes which are also in the same package as the declared class. <-------- kinda like `public` 
> - Classes inherited from the declared one, irrespective of their package.
> 
> Protected keywords are like a combination of both public and private keywords since they were introduced to access the variables outside the class (which is not possible in the case of private keywords) and maintain that only certain methods can inherit the same.

kay

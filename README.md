Part of my most recent challange: learn three languages at the same time c:

# BrownianMotionAndroid
An android app that draws particles undergoing brownian motion on tap. 

### current state of project

~~understanding java~~

- detects location of screen tap
- records it onto the screen
- creates particle based on it


![brownianmotion](https://user-images.githubusercontent.com/63464503/136333433-f9361871-040f-410c-a907-e4a8db7698d6.png)



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


## `Bundle` class 

- [ ] wuts this bundle stuff

## `protected` keyword

> Once a variable or a method is marked as protected, it can only be accessed by the below methods:
> 
> - Inside the same class in which it is declared. <------------ so like `private`
> - From other classes which are also in the same package as the declared class. <-------- kinda like `public` 
> - Classes inherited from the declared one, irrespective of their package.
> 
> Protected keywords are like a combination of both public and private keywords since they were introduced to access the variables outside the class (which is not possible in the case of private keywords) and maintain that only certain methods can inherit the same.

kay

## `@override`

- [ ] why an entire decorator for overriding parent methods

## the `androidx.appcompat.app.AppCompatActivity` class

https://developer.android.com/reference/androidx/appcompat/app/AppCompatActivity


# -- 

```Java
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
```

1 -> overrride parent method `onCreate`

2 -> define scope | return value is void | method name | arguments -> Bundle type named savedInstanceState

3 -> call the original onCreate method by passing the given savedInstanceState

4 -> ~~dunno yet~~ locates the xml file and sets it for the current Activity 


```Java
setContentView(R.layout.activity_main);
```

wuts this R stuff

fr where did it come from

https://www.quora.com/What-is-the-use-of-R-java-in-Android-Studio-and-how-do-you-use-it

> basically makes the connection between the XML files and Java. 


ok so this is like:

R.layout.activity_main -----> res/layout/activity_main.xml

-----------

this gunna be easy yooo c:

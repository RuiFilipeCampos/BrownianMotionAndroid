package com.example.brownianmotionandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

// the usual geometry stuff
class Vector{
    private double x, y;

    Vector(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Vector plus(Vector other){
        return new Vector(this.x + other.x, this.y + other.y);
    }

    public Vector minus(Vector other){
        return new Vector(this.x - other.x, this.y - other.y);
    }

    public double dot(Vector other){
        return this.x*other.x + this.y*other.y;
    }

    public void rotate(Vector axis){
        // will need to do rotation thingies
        return;
    }
}

class Particle{
    Vector position;
    Vector direction;
    double velocity;
}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
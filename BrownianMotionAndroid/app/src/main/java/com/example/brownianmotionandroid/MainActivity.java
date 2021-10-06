package com.example.brownianmotionandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

// the usual geometry stuff
class Vector{
    private double x, y, z;

    Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public Vector plus(Vector other){
        return new Vector(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public Vector minus(Vector other){
        return new Vector(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    public double dot(Vector other){
        return this.x*other.x + this.y*other.y + this.z*other.z;
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
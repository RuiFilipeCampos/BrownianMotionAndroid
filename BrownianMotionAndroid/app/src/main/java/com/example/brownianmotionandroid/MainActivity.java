package com.example.brownianmotionandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

// the usual geometry stuff
class Vector{
    private double x, y;

    Vector(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Vector plus(Vector other){
        return new Vector(
                this.x + other.x,
                this.y + other.y
        );
    }

    public Vector minus(Vector other){
        return new Vector(
                this.x - other.x,
                this.y - other.y
        );
    }

    public double dot(Vector other){
        return this.x*other.x + this.y*other.y;
    }

    public void rotate(Vector axis){
        // will need to do rotation thingies
        return;
    }

    public void inplace_scalar(double scalar){
        this.x *= scalar;
        this.y *= scalar;
    }
}

class Particle{
    Vector position;
    Vector direction;
    double speed;

    Particle(double x, double y, double vx, double vy){
        this.position = new Vector(x, y);
        this.speed = vx*vx + vy*vy;
        this.direction = new Vector(vx, vy);
        this.direction.inplace_scalar(1/this.speed);
    }
}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Particle RANDOM_WALKER = new Particle(
                0,  0,  1, 1
        );

        TextView click_count = findViewById(R.id.click_count);

        click_count.setText("Τest");

    }


}
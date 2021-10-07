package com.example.brownianmotionandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

import java.util.Arrays;

// the usual geometry stuff
class Vector{
    public double x, y;

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

    TextView click_count_display;
    int click_count;
    ArrayList<Particle> particles;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.particles = new ArrayList<Particle>();

        Particle RANDOM_WALKER = new Particle(
                0,  0,  1, 1
        );

        this.click_count_display = findViewById(R.id.click_count);
        this.click_count = 0;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event){

        if (event.getAction() == MotionEvent.ACTION_DOWN){
            this.click_count += 1;
            this.click_count_display.setText(
                    "x:" + Double.toString(event.getX()) + "  y:" + Double.toString(event.getY())
            );

            this.particles.add(
                    new Particle(
                        event.getX(),
                        event.getY(),
                        0, 1
                    )
            );

        }


        return super.onTouchEvent(event);

    }








}
package com.example.dagger_java.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    @Inject Engine engine;
    @Inject Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive() {
        Log.d(TAG, "drive ... :) ");
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }
}

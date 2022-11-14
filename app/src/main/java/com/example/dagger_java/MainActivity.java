 package com.example.dagger_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger_java.car.Car;
import com.example.dagger_java.car.CarComponent;
import com.example.dagger_java.car.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* CarComponent carComponent = DaggerCarComponent.create();
        car = carComponent.getCar();
        car.drive();*/

        // OR ...

       CarComponent carComponent2 = DaggerCarComponent.create();
       carComponent2.Inject(this);
       car.drive();

    }
}
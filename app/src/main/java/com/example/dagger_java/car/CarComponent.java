package com.example.dagger_java.car;

import com.example.dagger_java.MainActivity;

import dagger.Component;

@Component(modules = CarModules.class)
public interface CarComponent {
    Car getCar();
    void Inject(MainActivity mainActivity);
}

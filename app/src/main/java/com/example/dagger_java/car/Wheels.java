package com.example.dagger_java.car;

import javax.inject.Inject;

public class Wheels {

    private Rim rim;
    private Tires tires;

    public Wheels(Rim r , Tires t) {
        this.rim = r ;
        this.tires = t;
    }
}

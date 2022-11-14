package com.example.dagger_java.car;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModules {

    @Provides
    static Rim provideRim() {
        return new Rim();
    }
    @Provides
    static Tires provideTires(){
        return new Tires();
    }

    @Provides
    static Wheels providesWheels(Rim rim , Tires tires){
        return new Wheels(rim,tires);
    }
}

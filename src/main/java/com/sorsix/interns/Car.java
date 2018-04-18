package com.sorsix.interns;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private final Transmission transmission;
    private final Engine engine;

    public Car(Transmission transmission, Engine engine) {
        this.transmission = transmission;
        this.engine = engine;
    }

    public int drive() {
        return engine.getPower() * 50;
    }

    @Override
    public String toString() {
        return "I'm a car with engine " + engine + " and trans " + transmission;
    }
}

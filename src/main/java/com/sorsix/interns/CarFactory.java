package com.sorsix.interns;

public class CarFactory {
    public enum EngineType {
        ELECTRIC,
        OTO
    }

    public static Car createCar(EngineType type, int power) {
        if (type == EngineType.OTO) {
            return new Car(new Transmission("auto"), new OtoEngine(power));
        } else {
            return new Car(new Transmission("auto"), new ElectricEngine(power));
        }
    }
}

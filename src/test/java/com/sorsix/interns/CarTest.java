package com.sorsix.interns;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    Car car;

    @Before
    public void setup() {
        car = new Car(new Transmission("auto"), () -> 10);
    }

    @Test
    public void drive_test() {
        int actual = car.drive();
        assertEquals(500, actual);
    }
}
package daggerdemo.binds;

import daggerdemo.binds.engine.Engine;

import javax.inject.Inject;

/*
 * Scenario: The dependency Engine is an interface. So we cant create Inject constructor
 * Solution:
 *   Create a WheelsModule class that contains a Provider method
 *   The Provider method will return the Wheels instance.
 *   After that register WheelsModule to the car factory component.
 *
 * */

public class Car {
    private Engine engine;

    @Inject
    public Car(Engine engine) {
        this.engine = engine;
        System.out.println("Car initialized");
    }

    void drive() {
        engine.start();
        System.out.println("driving !!");
    }
}

package daggerdemo.modules;

import daggerdemo.modules.bob.Wheels;

import javax.inject.Inject;

public class Car {
    private Engine engine;
    private Wheels wheels;


    /*
    * Scenario: We cant add @inject to Wheels constructor
    * Solution:
    *   Create a WheelsModule class that contains a Provider method
    *   The Provider method will return the Wheels instance.
    *   After that register WheelsModule to the car factory component.
    *
    * */

    @Inject
    public Car(Engine engine, Wheels wheels) {
        System.out.println("Car initialized");
    }

    void drive() {
        System.out.println("driving !!");
    }
}

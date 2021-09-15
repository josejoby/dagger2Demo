package daggerdemo.constructorInjection;

import javax.inject.Inject;

public class Car {
    private Engine engine;

    @Inject
    public Car(Engine engine) {
        System.out.println("Car initialized");
    }

    void drive() {
        System.out.println("driving !!");
    }
}

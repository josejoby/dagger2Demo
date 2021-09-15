package daggerdemo.fieldInjection;

import javax.inject.Inject;

public class Main {

    @Inject Car car;

    void runMain(){
        CarFactory carFactory = DaggerCarFactory.create();
        carFactory.inject(this); //manually starting the injection.
        car.drive();
    }

    public static void main(String[] args) {
        new Main().runMain();
    }
}

package daggerdemo.modules;

public class Main {


    public static void main(String[] args) {
        new Main().runMain();
    }

    void runMain() {
        CarFactory carFactory = DaggerCarFactory.create();
        Car car = carFactory.getCar();
        car.drive();
    }
}

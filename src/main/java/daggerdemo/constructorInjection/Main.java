package daggerdemo.constructorInjection;

public class Main {


    void runMain(){
        CarFactory carFactory = DaggerCarFactory.create();
        Car car = carFactory.getCar();
        car.drive();
    }

    public static void main(String[] args) {
        new Main().runMain();
    }
}

package daggerdemo.constructorInjection;

import dagger.Component;

@Component
public interface CarFactory {
    Car getCar();
}

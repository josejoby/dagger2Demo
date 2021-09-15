package daggerdemo.modules;

import dagger.Component;

@Component (modules = WheelsModule.class)
public interface CarFactory {
    Car getCar();
}

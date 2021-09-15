package daggerdemo.binds;

import dagger.Component;

@Component(modules = DieselEngineModule.class)
public interface CarFactory {
    Car getCar();
}

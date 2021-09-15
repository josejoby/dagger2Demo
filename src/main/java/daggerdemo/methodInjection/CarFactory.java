package daggerdemo.methodInjection;

import dagger.Component;

@Component
public interface CarFactory {

    void inject(Main main);
}

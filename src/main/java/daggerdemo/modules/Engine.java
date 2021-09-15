package daggerdemo.modules;

import javax.inject.Inject;

public class Engine {

    @Inject
    Engine() {
        System.out.println("Engine Initialized");
    }

    ;
}

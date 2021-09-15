package daggerdemo.binds.engine;

import javax.inject.Inject;

public class PetrolEngine implements Engine {

    @Inject
    public PetrolEngine() {
        System.out.println("Engine Initialized");
    }

    @Override
    public String getName() {
        return "PetrolEngine";
    }

    @Override
    public void start() {
        System.out.println("Enigine "+getName()+" has started.");
    }
}

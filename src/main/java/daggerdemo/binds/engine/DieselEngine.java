package daggerdemo.binds.engine;

import javax.inject.Inject;

public class DieselEngine implements Engine{

    @Inject
    public DieselEngine() {
    }

    @Override
    public String getName() {
        return "DieselEngine";
    }

    @Override
    public void start() {
        System.out.println("Enigine "+ getName()+" has started.");
    }
}

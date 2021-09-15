package daggerdemo.modules;

import dagger.Module;
import dagger.Provides;
import daggerdemo.modules.bob.Rims;
import daggerdemo.modules.bob.Tires;
import daggerdemo.modules.bob.Wheels;

@Module
public class WheelsModule {

    @Provides
    Rims provideRims(){ //name doesn't matter.
        return new Rims();
    }

    @Provides
    Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims, tires);
    }
}

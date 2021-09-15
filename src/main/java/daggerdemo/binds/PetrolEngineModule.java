package daggerdemo.binds;

import dagger.Binds;
import dagger.Module;
import daggerdemo.binds.engine.Engine;
import daggerdemo.binds.engine.PetrolEngine;

@Module
public abstract class PetrolEngineModule {

    /*    @Provides
        Engine provideEngine(PetrolEngine engine){
            return engine;
        }*/
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);

}

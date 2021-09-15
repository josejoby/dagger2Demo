package daggerdemo.binds;

import dagger.Module;
import dagger.Provides;
import daggerdemo.binds.engine.DieselEngine;
import daggerdemo.binds.engine.Engine;

@Module
public class DieselEngineModule {

    @Provides
    Engine provideEngine(DieselEngine engine){
        return engine;
    }

}

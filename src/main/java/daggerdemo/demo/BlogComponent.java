package daggerdemo.demo;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component
public interface BlogComponent {

//    Blog getBlog();

    void inject(Main main);

}

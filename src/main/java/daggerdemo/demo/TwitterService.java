package daggerdemo.demo;

import javax.inject.Inject;

public class TwitterService {

    @Inject
    public TwitterService() {
        System.out.println("Prod Twitter service intialized");
    }
}

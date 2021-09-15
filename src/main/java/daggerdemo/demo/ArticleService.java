package daggerdemo.demo;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ArticleService {

    @Inject
    public ArticleService() {
        System.out.println("Prod ArticleService Initialized");
    }
}

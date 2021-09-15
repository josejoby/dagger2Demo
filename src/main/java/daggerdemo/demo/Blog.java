package daggerdemo.demo;

import javax.inject.Inject;

public class Blog {

    private TwitterService twitterService;
    private ArticleService articleService;

    @Inject
    public Blog(TwitterService twitterService, ArticleService articleService) {
        this.twitterService = twitterService;
        this.articleService = articleService;
    }

    public void start() {
        System.out.println("your blog is running");
    }


    public boolean isRunning(){
        return Boolean.TRUE;
    }
}

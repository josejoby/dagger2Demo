package daggerdemo.demo;

import javax.inject.Inject;

public class Main {

    @Inject
    Blog blog;

    public void runMain(){
        BlogComponent blogComponent = DaggerBlogComponent.create();
//        blog = blogComponent.getBlog();
//        blog.start();

        blogComponent.inject(this);
        blog.start();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.runMain();
    }
}

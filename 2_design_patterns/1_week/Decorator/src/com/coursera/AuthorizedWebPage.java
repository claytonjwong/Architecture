package com.coursera;

public class AuthorizedWebPage extends WebPageDecorator {
    AuthorizedWebPage(IWebPage webPage) {
        super(webPage);
    }
    public void display() {
        super.display();
        System.out.println("🙂 authorized");
    }
}

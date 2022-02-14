package com.coursera;

public class AuthenticatedWebPage extends WebPageDecorator {
    AuthenticatedWebPage(IWebPage webPage) {
        super(webPage);
    }
    public void display() {
        super.display();
        System.out.println("✅ authenticated");
    }
}

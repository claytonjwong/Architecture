package com.coursera;

abstract public class WebPageDecorator implements IWebPage {
    protected IWebPage webPage;
    WebPageDecorator(IWebPage webPage) {
        this.webPage = webPage;
    }
    public void display() {
        this.webPage.display();
    }
}

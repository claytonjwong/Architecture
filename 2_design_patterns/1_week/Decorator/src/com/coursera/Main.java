package com.coursera;

public class Main {

    public static void main(String[] args) {
        IWebPage webPage = new WebPage();
        webPage = new AuthenticatedWebPage(webPage);
        webPage = new AuthorizedWebPage(webPage);
        webPage.display();
        /*
        🦄 rendering base webpage HTML here
        ✅ authenticated
        🙂 authorized
        */
    }
}

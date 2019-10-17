package com.raj.adapter.Factory;

public class AndroidPhone extends Phone {

    protected void createPhone() {
        specifications.add(new AndroidPanel());
        specifications.add(new AndroiProcessor());
    }
}
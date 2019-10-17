package com.raj.adapter.Factory;

public class IPhone extends Phone {
    protected void createPhone() {
        specifications.add(new IPhonePanel());
        specifications.add(new IPhoneProcessor());
    }
}
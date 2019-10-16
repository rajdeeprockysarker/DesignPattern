package com.raj.adapter.facade;

public class FacadePhone {

    private IPhone iPhone;

    private OnePlus onePlus;

    public FacadePhone() {
        iPhone = new IPhone();

        onePlus = new OnePlus();
    }

    public String buildApplePhone() {
        return iPhone.build();
    }

    public String buildAndroidPhone() {
        return onePlus.build();
    }

}
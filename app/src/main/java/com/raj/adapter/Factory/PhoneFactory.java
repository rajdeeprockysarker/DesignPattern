package com.raj.adapter.Factory;

public class PhoneFactory {

    public static Phone getPhone(PhoneTypeEnum phoneType) {
        switch (phoneType) {
            case ANDROID:
                return new AndroidPhone();
            case IPHONE:
                return new IPhone();
            default:
                return null;
        }
    }
}
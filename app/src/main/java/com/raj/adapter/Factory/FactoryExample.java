package com.raj.adapter.Factory;


public class FactoryExample {


    public static void main(String[] args) {


        Phone android = PhoneFactory.getPhone(PhoneTypeEnum.ANDROID);
        Phone iphone = PhoneFactory.getPhone(PhoneTypeEnum.IPHONE);
        Phone iphone2 = PhoneFactory.getPhone(PhoneTypeEnum.IPHONE);

        System.out.println(android);
        System.out.println(iphone);
        System.out.println(iphone2);

        /*
        1. Calendar
        2. NumberFormat
         */
    }
}
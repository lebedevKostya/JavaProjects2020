package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Phone sMobPhone = new MobilePhone();

        sMobPhone.setBrande("iPhone");
        sMobPhone.setModel("10");
        sMobPhone.setPhoneNumber(870022213123L);
        sMobPhone.call();
        sMobPhone.getType();

        Phone phoneNumber1 = new PhoneNumber();

        phoneNumber1.setPhoneNumber(89539169985L);
        phoneNumber1.call();
        phoneNumber1.getType();

        Phone toyPhone = new ToyPhone();

        toyPhone.setModel("099Baby-toy");
        toyPhone.setPhoneNumber(89539238771L);
        toyPhone.setBrande("iBaby");
        toyPhone.getType();
        toyPhone.call();

        ArrayList<Phone> object = new ArrayList<>();

        object.add(0,toyPhone);
        object.add(1,phoneNumber1);
        object.add(2,sMobPhone);

        for (Phone phone : object) {

            System.out.println(phone);
        }

    }
}





package com.company.enums;


public enum Gender {
    MALE, FEMALE;

    public static Gender getGender(String gender) {
        if (gender.equals("m")) {
            return Gender.valueOf("MALE");
        }
        else if (gender.equals("f")) {
            return Gender.valueOf("FEMALE");
        }
        else {
            System.out.println("Нету такого пола!");
        }
        return null;
    }
}

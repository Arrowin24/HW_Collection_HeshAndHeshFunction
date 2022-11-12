package GovermentStructure;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Passport> passports = new HashMap<>();
        Passport passport1 = new Passport("Iv", "Iv", "Iv", 1997);
        Passport passport2 = new Passport("IL", "Il", "Il", 1998);
        Passport passport3 = new Passport("U", "U", "U", 1999);
        Passport passport4 = new Passport("G", "G", "G", 2000);

        passports.put(passport1.getPassportID(),passport1);
        passports.put(passport2.getPassportID(),passport2);
        passports.put(passport3.getPassportID(),passport3);
        passports.put(passport4.getPassportID(),passport4);

        System.out.println(passports.get(passport2.getPassportID()));

        passport2.setName("NewName");
        System.out.println(passports.get(passport2.getPassportID()));
        System.out.println(passports.get(6));
    }
}

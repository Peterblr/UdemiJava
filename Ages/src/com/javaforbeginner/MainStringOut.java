package com.javaforbeginner;

public class MainStringOut {
    public static void main(String[] args) {
        String s1 = "Skynet ", s2 = " world!", sResult;
        sResult = "Today " + s1 + " will take " + s2;
        System.out.println(sResult);

        sResult = String.format("TODAY %s WILL TAKE %s", s1, s2);
        System.out.println(sResult);

        System.out.printf("T O D A Y %s W I L L   T A K E %s", s1, s2);
        System.out.printf("T O D A Y %s W I L L   T A K E %s\r\n", s1, s2);
        System.out.printf("T O D A Y %s W I L L   T A K E %s", s1, s2);

        System.out.println();

        System.out.printf("|%20s|%n","Hello");
        System.out.printf("|%-20s|%n","new");
        System.out.printf("|%-20s|%n","world");

        System.out.println();

        System.out.printf("|%05d|%n",1);
        System.out.printf("|%05d|%n",22);
        System.out.printf("|%5d|%n",333);
        System.out.printf("|%05d|%n",4444);
        System.out.printf("|%05d|%n",55555);

        System.out.println();

        System.out.printf("%,d%n", 123456789123456789L);

    }
}

package com.javaforbeginner;

public class MainString {
    public static void main(String[] args) {
        //creation and initialization options String

        String myString = "Hello world!";

        String emptyString = new String();

        char[] ch = {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
        String charString = new String(ch);
        String charString1 = new String(ch, 6, 6);

        System.out.println(charString1);
        System.out.println(charString);

        //addition String

        String plusString = myString + charString1;
        System.out.println(plusString);

        String plusString1 = myString + " " + charString1 + 5;
        System.out.println(plusString1);

        //comparison String
        String myString1 = "Hello world!";
        String myString2 = "Hello world!";
        String myString3 = new String("Hello world!");

        boolean b = (myString1 == myString2);
        System.out.println(b);

        b = (myString1 == myString3);
        System.out.println(b);

        b = (myString1.equals(myString3));
        System.out.println(b);

        //split String

        String[] words = myString.split(" ");
        System.out.println(words.length);
        for (String st1 :
                words) {
            System.out.print(st1 + ",");

        }
        //remove spaces
        System.out.println();
        String s = "    Hello people   ";
        System.out.println("=" + s + "=");
        System.out.println("=" + s.strip() + "=");

    }
}

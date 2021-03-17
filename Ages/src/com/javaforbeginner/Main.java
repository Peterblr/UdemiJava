package com.javaforbeginner;

public class Main {

    public static void main(String[] args) {

        boolean myBoolean, myBoolean123 = false, myBoolean_123, _myBoolean;
        byte myByte = (byte) (127 + 5), myByte1 = 1, myByte2 = 2, myByte3;
        myByte3 = (byte) (myByte1 + myByte2);
        short myShort = 250;
        int mzInt = 1_000_000;
        long myLong = 100L;
        char myChar = 'a', _myChar = '\u0470';
        float myFloat = 100.0F;
        double myDouble = 100.0;

        myBoolean = true;
        _myBoolean = false;

        String myString = "Hello world!";

        System.out.println("variable char = " + myChar + "   " + _myChar);
        System.out.println("variable byte = " + myByte);
        System.out.println(myString);
    }
}

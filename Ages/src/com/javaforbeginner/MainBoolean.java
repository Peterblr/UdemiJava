package com.javaforbeginner;

public class MainBoolean {
    public static void main(String[] args) {
        //booleans operations
        boolean a = true, b = false, c = true, d = false, e;
        String str = "a = " + a + "; b = " + b + "; c = " + c + "; d = " + d + ";";
        System.out.println(str);

        e = a == b;
        str = "a == b; e = " + e;
        System.out.println(str);
        e = a == c;
        str = "a == c; e = " + e;
        System.out.println(str);

        e = a & b;
        str = "a & b; e = " + e;
        System.out.println(str);
        e = c & b;
        str = "c & b; e = " + e;
        System.out.println(str);
        e = a & c;
        str = "a & c; e = " + e;
        System.out.println(str);
        e = c & d;
        str = "a & b; e = " + e;
        System.out.println(str);

        e = a | b;
        str = "a | b; e = " + e;
        System.out.println(str);
        e = c | b;
        str = "c | b; e = " + e;
        System.out.println(str);
        e = a | c;
        str = "a | c; e = " + e;
        System.out.println(str);
        e = b | d;
        str = "a | b; e = " + e;
        System.out.println(str);

        e = !a;
        str = "!a; e = " + e;
        System.out.println(str);
        e = !b;
        str = "!b; e = " + e;
        System.out.println(str);

        //ternary operator
        int a1 = 10, l = 0;

        e = (a1 == 1) ? true : false;
        str = "a1 = " + a1 + "; a1 == 1 ? e = " + e + ";";
        System.out.println(str);
        e = a ? true : false;
        str = "a = " + a + "; e = a ? e = " + e + ";";
        System.out.println(str);
        l = (a1 == 1) ? 10 : 20;
        str = "a1 = " + a1 + "; a1 == 1 ? l = " + l + ";";
        System.out.println(str);




    }
}

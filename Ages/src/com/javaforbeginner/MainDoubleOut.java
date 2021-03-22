package com.javaforbeginner;

public class MainDoubleOut {
    public static void main(String[] args) {
        double pi = Math.PI;
        System.out.printf("PI = " + pi + "\n");
        System.out.printf("PI = %.2f%n",pi);
        System.out.printf("PI = %05.2f%n",pi);
        System.out.printf("PI = %010.2f%n",pi);
    }
}

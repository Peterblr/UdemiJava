package com.javaforbeginner;

import java.util.Scanner;

public class InvertTemp {
    public static void main(String[] args) {
        System.out.print("Insert your temp in F: ");
        Scanner sc = new Scanner(System.in);
        float degreeF = sc.nextFloat();
        float degreeC = (5f/ 9) * (degreeF - 32);
        System.out.println();
        System.out.println(degreeF + "F = " + degreeC + "C");
    }
}

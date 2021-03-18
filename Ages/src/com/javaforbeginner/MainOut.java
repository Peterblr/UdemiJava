package com.javaforbeginner;

import java.util.Scanner;

public class MainOut {
    public static void main(String[] args) {
        System.out.print("Hello world!\r\n");
        System.out.println("Hello world 2!");

        Scanner sc = new Scanner(System.in);
        String userName;
        System.out.print("Insert your name: ");
        userName = sc.nextLine();
        System.out.print("Insert your old: ");
        int userOld = sc.nextInt();
        System.out.println();
        System.out.println("Your name is " + userName);
        System.out.println("Your old " + userOld);


    }
}

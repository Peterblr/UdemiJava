package com.cycles;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert name 'Pablo' or 'Rosa' or 'Mario' or 'Rama'" +
                " or 'Jone' or 'Mila': ");
        name = sc.nextLine();

        //if-else-if
        if (name.equals("Pablo")) {
            System.out.println(name + " is boy");
        } else if (name.equals("Rosa")) {
            System.out.println(name + " is girl");
        } else {
            System.out.println("You didn't insert correct name!");
        }

        if (name.equals("Pablo")
                || name.equals("Mario")
                || name.equals("Jone")
        ) {

            System.out.println(name + " is boy");
        } else if (name.equals("Rosa")
                || name.equals("Mila")
                || name.equals("Rama")
        ) {

            System.out.println(name + " is girl");
        } else {
            System.out.println("You didn't insert correct name!");
        }

        //switch
        switch (name) {
            case "Pablo":
                System.out.println(name + " is boy");
                break;
            case "Mario":
                System.out.println(name + " is boy");
                break;
            case "Jone":
                System.out.println(name + " is boy");
                break;
            case "Rosa":
                System.out.println(name + " is girl");
                break;
            case "Mila":
                System.out.println(name + " is girl");
                break;
            case "Rama":
                System.out.println(name + " is girl");
                break;
            default:
                System.out.println("You didn't insert correct name!");

        }

        switch (name) {
            case "Pablo":
            case "Mario":
            case "Jone":
                System.out.println(name + " is boy");
                break;
            case "Rosa":
            case "Mila":
            case "Rama":
                System.out.println(name + " is girl");
                break;
            default:
                System.out.println("You didn't insert correct name!");

        }

        //while

        String[][] names = {
                {"Mario", "is boy"},
                {"Pablo", "is boy"},
                {"Jone", "is boy"},
                {"Mila", "is girl"},
                {"Rosa", "is girl"},
                {"Rama", "is girl"},
        };

        if (name.equals(names[0][0])) {
            System.out.printf("%s this %s%n%n", name, names[0][1]);
        }

        int i = 0;
        while (i < names.length) {
            if (name.equals(names[i][0])) {
                System.out.printf("%s this %s%n%n", name, names[i][1]);
            }

            i++;

        }

    }
}

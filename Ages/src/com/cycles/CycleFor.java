package com.cycles;

import java.util.Scanner;

public class CycleFor {
    public static void main(String[] args) {

        String[][] names = {
                {"Mario", "is boy"},
                {"Pablo", "is boy"},
                {"Jone", "is boy"},
                {"Mila", "is girl"},
                {"Rosa", "is girl"},
                {"Rama", "is girl"},
        };
        Scanner sc = new Scanner(System.in);
        String name;
        do {
            System.out.print("Insert name (Mario, Pablo, Jone, Mila, Rosa,  Rama) \r\n (exit) - if you will close program");
            System.out.println();
            name = sc.nextLine();

            if (name.equals("exit")) {
                break;
            }

            if (name.equals("Hello")) {
                System.out.println("Hi!!!");
                continue;
            }

//            int i = 0;
//            while (i < names.length) {
//                System.out.printf("iteration № %d%n", i);
//                if (name.equals(names[i][0])) {
//                    System.out.printf("%s this %s%n%n", name, names[i][1]);
//                    break;
//                }
//                i++;
//            }

            for (int i = 0; i < names.length; i++) {
                System.out.printf("iteration № %d%n", i);
                if (name.equals(names[i][0])) {
                    System.out.printf("%s this %s%n%n", name, names[i][1]);
                    break;
                }
                
            }

        }
        while (true);
    }
}

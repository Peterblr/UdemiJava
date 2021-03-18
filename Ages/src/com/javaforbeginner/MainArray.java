package com.javaforbeginner;

public class MainArray {
    public static void main(String[] args) {
        String[] garage = new String[3];
        int[] ages = {10, 15, 20};
        int i = 1;
        garage[0] = "Garage 1";
        garage[1] = "Garage 2";
        garage[2] = "Garage 3";
        System.out.println("Garage " + (i + 1) + " - is " + garage[i]);

        System.out.println("we have " + garage.length + " garages");
        for (int a :
                ages) {
            System.out.println(a);
        }

        int[][] multiplicationTable = new int[10][10];

        int a = 2;
        int b = a;
        a = 1;
        System.out.println("a = " + a + "; b = " + b);
        int[] c = {1, 2};
        int[] d = c;
        int[] d1 = c.clone();
        c[1] = 3;
        System.out.println("c[0] = " + c[0] + "; c[1] = " + c[1]);
        System.out.println("d[0] = " + d[0] + "; d[1] = " + d[1]);
        System.out.println("d1[0] = " + d1[0] + "; d1[1] = " + d1[1]);
        System.out.println();

        int[][] twoD = new int[4][5];
        int k = 0;
        for (int i1 = 0; i1 < 4; i1++) {
            for (int j1 = 0; j1 < 5; j1++) {
                twoD[i1][j1] = k++;
                System.out.print(twoD[i1][j1] + " ");
            }
            System.out.println();
        }
        System.out.println();

        char symbol = 'a';
        String[][] arStr = new String[7][10];
        for (int j = 0; j < arStr.length; j++) {
            for (int l = 0; l < arStr[0].length; l++) {
                arStr[j][l] = symbol + "" + (l + 1);
                System.out.print(arStr[j][l] + " ");
            }
            symbol++;
            System.out.println();
        }

        System.out.println();

        int[][] arr1 = new int[4][];
        arr1[0] = new int[1];
        arr1[1] = new int[2];
        arr1[2] = new int[3];
        arr1[3] = new int[4];
        int q, w, e = 0;
        for (q = 0; q < arr1.length; q++){
            for (w = 0; w < arr1[q].length; w++){
                arr1[q][w] = e++;
                System.out.print(arr1[q][w] + " ");
            }
            System.out.println();
        }

        System.out.println();

        double[][] arrDouble = {
                {0, 1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11},
                {12, 13, 14, 15}
        };
        for (double[] line :
                arrDouble) {
            for (double element :
                    line) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}

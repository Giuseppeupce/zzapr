package zzapr;

import java.util.Scanner;

public class MultiplicationTable {


    public static void main(String[] args) {
        //TODO write a program that will list multiplication table for defined
        // values, e.g. <0, 10>
        Scanner input = new Scanner(System.in);

        System.out.print(" Write from which value to start the table: ");
        int start = input.nextInt();

        System.out.print(" Write from which value to end the table with: ");
        int end = input.nextInt();

        if (start < end) {
// rows
            for (int i = start; i <= end; i++) {
//columns
                for (int j = start; j <= end; j++) {
                    System.out.printf("%6d", i * j);
                }
                System.out.println();
            }
        } else {
            System.out.println("Wrong values for starting and end point entered!!!");
        }
    }
}

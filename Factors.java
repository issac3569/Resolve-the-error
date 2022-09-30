//Input a number and print all the factors of that number
package com.company.Assignment;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = in.nextInt();
        for(int counter=1; counter <=num; counter++) {
            if (num % counter == 0) {
                System.out.println(counter);
            }
        }
    }
}

package com.bridglabz;
import java.util.*;
public class Fibonacci_Series {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = 0, n2 = 1, n3, i, count;
        System.out.println("Enter the number of terms: ");
        count = sc.nextInt();
        System.out.print(n1 + " " + n2);

        for (i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

    }
}

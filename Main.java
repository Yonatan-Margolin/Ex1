package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int x;
        int y;
        if (args.length < 2) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first number for max prime GCD: ");
            x = scanner.nextInt();
            System.out.print("Enter the number second number for max prime GCD: ");
            y = scanner.nextInt();
        } else {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
        }

        System.out.println("Computes the GPCD(" + x + "," + y + ") = ");
        int ans;
        if (x < y) {
            ans = x;
            x = y;
            y = ans;
        }



        ans = 1;

        for(int i = 2; i <= y; ++i) {
            boolean prime = true;
            double max = Math.sqrt((double)i);

            for(int a = 2; ((double)a <= max) && prime; ++a) {
                if (i % a == 0) {
                    prime = false;
                }
            }

            if (prime && x % i == 0 && y % i == 0) {
                ans = i;
            }
        }

        System.out.println("Max Prime Common Divider: " + ans);
    }
}

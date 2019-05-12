package com.sda.algorytymy;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }

    public static void fibonacci2() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N < 2) {
            System.out.println(N);
        } else {
            int A = 0;
            int B = 1;
            int C = 1;
            int K = 2;

            while (K < N) {
                A = B;
                B = C;
                C = A + B;
                K++;
            }
            System.out.println(C);

        }
    }

    public static void main(String[] args) {


        fibonacci2();
        System.out.println(fibonacci(5));
        int tab[] = new int[20];
        tab[0] = 0;
        tab[1] = 1;
        for (int i = 2; i < tab.length; i++) {
            tab[i] = tab[i - 1] + tab[i - 2];

            System.out.println(tab[i]);


        }

    }
}
package com.sda.algorytymy;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        int tab[] = new int[20];
        tab [0] =0;
        tab [1]=1;
        for (int i = 2; i < tab.length; i++) {
            tab [i] = tab [i-1] + tab [i-2];

            System.out.println(tab[i]);


        }

    }
}

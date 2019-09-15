package com.company;

import com.sun.corba.se.impl.io.OptionalDataException;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Massive {

    private int n = 0;
    private int[] mas = new int[n];
    private int b;
    private int n2;
    private int[] mas2 = new int[n2];

    public Massive() throws FileNotFoundException {
    }

    public void printArray() {
        n = 5;
        System.out.println(mas[6]);
    }
    public void multiCatch() {

        b = 42 / n;
        mas[2] = 99;
        System.out.println("Access to the third element" + " " + mas[3]);
    }
    public void exampleWithFinally() {
        mas2[5] = 4;
        if (n2 > 6) {
            System.out.println("You can't print mas2");
        }
    }
    void procedure() {
        try {
            int a[] = {1};
            a[34] = 218;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array index is " + " " + ex);
        }
    }
}


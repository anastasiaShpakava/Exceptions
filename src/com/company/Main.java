package com.company;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.lang.AutoCloseable;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Massive massive = new Massive();
        try {
            massive.multiCatch();
        } catch (ArithmeticException ex) {
            System.out.println("You can't divide by zero");
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
        System.out.println("You don't have access to the third element");
        try {
            massive.printArray();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("You can't print this array with size " + " " + ex.getMessage());
        }
        try {
            massive.multiCatch();
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException ex) {
            System.out.println("Error" + " " + ex.getMessage());
        }

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter size of mas2");
            int n2 = scanner.nextInt();
            massive.exampleWithFinally();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("You can't print mas2 with this size");
        } finally {

            System.out.println("That's life");
        }
        /////////////////////////////////////// дополнительное задание
////////////////////////1
        try (PrintStream stream = new PrintStream("hello.txt")) {
            System.out.println("Hello world!");
        } catch (FileNotFoundException ex) {
            System.err.println("Cannot open the file");
        } finally {
            System.err.println("All done");
        }
        /////////////////2
        try {
            int a = 0;
            int b = 218 / a;
            massive.procedure();
        } catch (ArithmeticException ex) {
            System.out.println("Division by zero: " + ex);
        }
        ////////////////////////3
        try {
            System.out.println("Если после этой строчки ничего не будет, то оператор finally не вызвался");
            System.exit(0);
        } finally {
            System.out.println("Hello!!!!!");
        }
    }
}



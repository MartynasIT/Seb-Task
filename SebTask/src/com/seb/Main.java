package com.seb;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static int intA, intB;

    public static void main(String[] args) {
       inputA();
       inputB();
       System.out.println("Took only: " + 1 + Generator.generator(intA, intB) + " comparisons");
    }

    public static void inputA() {
        System.out.print("First Number: ");
        try {
            Scanner input = new Scanner(System.in);
            intA = input.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Please enter number");
            inputA();

        }

    }

    public static void inputB() {
        System.out.print("Second Number: ");
        try {
            Scanner input = new Scanner(System.in);
            intB = input.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Please enter number");
            inputB();

        }

    }
}
package com.arsal;

import java.util.Scanner;

public class RecursiveTry1 {
    public static void main(String[] args) {
        System.out.println("Test1");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        RecursiveTry1 recursiveTry1 = new RecursiveTry1();
        System.out.println("Square Root is " + recursiveTry1.squarerootDoWhile(scanner.nextDouble()));;
    }

    public double squarerootDoWhile(double input) {
        double t;
        double squareroot = input / 2;
        do {
            t = squareroot;
            squareroot = (t + input/t)/2;
        } while ((t-squareroot) != 0);
        return squareroot;
    }

//    public double squarerootRecursive(double input, double actualNumber) {
//        double t = input;
//        double squareroot = (input + actualNumber/input)/2;
//        if(input - squareroot <= 0.001) return squareroot;
//        else squarerootRecursive(squareroot, actualNumber);
//    }
}

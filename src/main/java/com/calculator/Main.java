package com.calculator;

import java.util.Scanner;

public class Main {
    public static double A(double a, double b, double c, double d) {
        return (a+b)/(c+d);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, d;

        while (true) {
            System.out.print("Enter a: ");
            try {
                a = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid format");
            }
        };

        while (true) {
            System.out.print("Enter b: ");
            try {
                b = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid format");
            }
        };
        
        while (true) {
            System.out.print("Enter c: ");
            try {
                c = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid format");
            }
        };
        
        while (true) {
            System.out.print("Enter d: ");
            try {
                d = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid format");
            }
        };

        System.out.println(A(a, b, c, d));
    }
}
package org.example;

import calculatorService.Calculator;

import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        System.out.println("Enter the operator (+,-,*,/)");
        char op = sc.next().charAt(0);

        Calculator.calculation(num1, op, num2);

    }
}
package com.it.academy;
import java.util.Scanner;

public class NumbersComparison {
    public static void main(String[] args) {
        int number_1;
        int number_2;

        System.out.println("Type in first number");
        Scanner scanner = new Scanner(System.in);
        number_1 = scanner.nextInt();

        System.out.println("Type in second number");
        Scanner scan = new Scanner(System.in);
        number_2 = scanner.nextInt();

        if (number_1 > number_2) {
            System.out.println(number_1 + " > " + number_2);
        }
        else if (number_1 < number_2) {
            System.out.println(number_1 + " < " + number_2);
        }
        else if (number_1 == number_2) {
            System.out.println(number_1 + " = " + number_2);
        }
    }
}
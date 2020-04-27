package com.it.academy;
import java.util.Scanner;
public class AgeDiscounts {
    public static void main(String[] args) {
        int age;
        String clientBought;

        System.out.println("What is your age:");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();

        if (age > 65)  {
            System.out.println("You are eligible for 10% discount!");
        }
        else if (age < 18) {
            System.out.println("You are eligible for 25% discount!");
        }

        System.out.println("Have you bought from us before?:(yes|no)");
        Scanner scan = new Scanner(System.in);
        clientBought = scan.nextLine();

        if  (clientBought.equals("yes")){
            System.out.println("Welcome back! You are eligible for additional 5% discount!");
        }

    }
}

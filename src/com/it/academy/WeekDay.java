package com.it.academy;
import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        int weekdayNumerical;
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday","Sunday"};

        while(true){
          System.out.println("Please type in a number between 1 and 7");
          Scanner scanner = new Scanner(System.in);
          weekdayNumerical = scanner.nextInt();
          if  (0 < weekdayNumerical && weekdayNumerical < 8 ) {
                break;
            }
          else {
              System.out.println("The number must be  between 1 and 7. Please try again");
        }
        }
        System.out.println("The day of the week corresponding to your number is " + weekdays[weekdayNumerical-1]);
    }
}
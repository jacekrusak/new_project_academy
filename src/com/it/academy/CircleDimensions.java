package com.it.academy;
import java.lang.Math.*;
import java.util.Scanner;

public class CircleDimensions {
    public static void main(String[] args){
        System.out.println("Please type in a radius of a circle");
        Scanner scanner = new Scanner(System.in);
        double circleRadius= scanner.nextDouble();
        double circlePerimeter = 2 * Math.PI * circleRadius;
        double circleArea = Math.PI * circleRadius * circleRadius;
        System.out.println("Perimeter of the circle is : " + circlePerimeter);
        System.out.println("Area of the circle is : " + circleArea );
    }
}

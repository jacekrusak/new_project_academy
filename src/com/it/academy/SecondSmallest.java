package com.it.academy;
import java.util.Arrays;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = { 8, 3, 4, 2, 4, 5, 9};
        Arrays.sort(arr);
        System.out.println("the smallest number in the array is " + arr[0]);
        System.out.println("the second smallest number in the array is " + arr[1]);
    }

}

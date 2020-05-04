package com.it.academy;


class ReversedArray
{

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4 };
        int[] temp_arr = new int[arr.length];

        System.out.print("original array: ");
        for (int number: arr) {
            System.out.print(number +" ");
        }

        for (int i = 0; i < arr.length; i++) {

            temp_arr[arr.length -1 -i] = arr[i];
                        }
        for (int i = 0; i < arr.length; i++){
            arr[i] = temp_arr[i];
        }
        System.out.println();
        System.out.print("reversed array: ");
        for (int number: arr) {
                     System.out.print(number + " ");
        }
        }

       }

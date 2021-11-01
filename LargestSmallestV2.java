package com.company.chapter2;
import java.util.Scanner;

public class LargestSmallestV2 {
    public static void main(String[] args){

         // Explain what this program will do
        System.out.println("This program will read five integers and print the Largest and Smallest");

        // Create a scanner named input
        Scanner input = new Scanner(System.in);

        // ask user for first int and save in num1 input.nextInt()
        System.out.print("Please enter the first integer: ");
        int num1 = input.nextInt();

        // ask user for second int and save in num2 input.nextInt()
        System.out.print("Please enter the second integer: ");
        int num2 = input.nextInt();

        // ask user for third int and save in num3 input.nextInt()
        System.out.print("Please enter the third integer: ");
        int num3 = input.nextInt();

        // ask user for fourth int and save in num4 input.nextInt()
        System.out.print("Please enter the fourth integer: ");
        int num4 = input.nextInt();

        // ask user for fifth int and save in num5 input.nextInt()
        System.out.print("Please enter the fifth integer: ");
        int num5 = input.nextInt();

        // for loop comparing ints (Largest)
        if (num1 > num2){  // if num 1 is larger than num 2 continue
            if (num1 > num3){  // if num 1 is larger than num 3 continue
                if (num1 > num4){  // if num 1 is larger than num 4 continue
                    if (num1 > num5){  // if num 1 is larger than num 5 print out num1 is the largert
                        System.out.printf("Largest number is %d%n", num1);
                    }
                }
            }
        }

        if (num2 > num1){
            if (num2 > num3){
                if (num2 > num4){
                    if (num2 > num5){
                        System.out.printf("Largest number is %d%n", num2);
                    }
                }
            }
        }

        if (num3 > num1) {
            if (num3 > num2) {
                if (num3 > num4) {
                    if (num3 > num5) {
                        System.out.printf("Largest number is %d%n", num3);
                    }
                }
            }
        }

            if (num4 > num1) {
                if (num4 > num2) {
                    if (num4 > num3) {
                        if (num4 > num5) {
                            System.out.printf("Largest number is %d%n", num4);
                        }
                    }
                }
            }

            if (num5 > num1) {
                if (num5 > num2) {
                    if (num5 > num3) {
                        if (num5 > num4) {
                            System.out.printf("Largest number is %d%n", num5);
                        }
                    }
                }
            }


        // for loop comparing ints (smallest)

        if (num1 < num2){  // if num1 is less than num2 continue
            if (num1 < num3){  // if num1 is less than num3 continue
                if (num1 < num4){  // if num1 is less than num4 continue
                    if (num1 < num5){  // if num1 is less than num5 print out num1 is the smallest
                        System.out.printf("Smallest number is %d%n", num1);
                    }
                }
            }
        }

        if (num2 < num1){
            if (num2 < num3){
                if (num2 < num4){
                    if (num2 < num5){
                        System.out.printf("Smallest number is %d%n", num2);
                    }
                }
            }
        }

        if (num3 < num1){
            if (num3 < num2){
                if (num3 < num4){
                    if (num3 < num5){
                        System.out.printf("Smallest number is %d%n", num3);
                    }
                }
            }
        }

        if (num4 < num1){
            if (num4 < num2){
                if (num4 < num3){
                    if (num4 < num5){
                        System.out.printf("Smallest number is %d%n", num4);
                    }
                }
            }
        }

        if (num5 < num1){
            if (num5 < num2){
                if (num5 < num3){
                    if (num5 < num4){
                        System.out.printf("Smallest number is %d%n", num5);
                    }
                }
            }
        }

    }
}

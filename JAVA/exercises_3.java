package com.JAVA;

//reverse a number using while loop

import java.util.Scanner;

public class exercises_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
     int reverse = 0;
        while (number>0){

                int remainder= number%10;
                reverse = reverse*10 + remainder;
                number = number/10;
        }
        System.out.println(reverse);
    }
}

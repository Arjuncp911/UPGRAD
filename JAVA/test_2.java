package com.JAVA;


import java.util.Scanner;

/* Write a program that will take 5 numbers ass input (one number per line). The program will
        then calculate the cumulative sum of numbers in each line if it is odd. */
public class test_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] arr = new int[5];
        for (int i =0;i<5;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<5;i++){
            sum = sum + arr[i];
            if((i+1)%2!=0) {
                System.out.println(sum);
            }
        }
    }
}

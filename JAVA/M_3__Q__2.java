package com.JAVA;

import java.util.Scanner;

//check whether the number is armstrong or not for ex 153=1^3+5^3+3^3

public class M_3__Q__2 {
    public static void main(String[] args) {
        long N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        System.out.println("enter a number");
        System.out.println("Armstrong number between 1 to " + N);
        for (int i = 1; i <= N; i++) {
            if (isArmstrongNumber(i))
                System.out.println(i);
        }

    }

    public static boolean isArmstrongNumber(int num) {
        int sum = 0, rightDigit, temp;
        temp = num;
        while (temp != 0) {
            rightDigit = temp % 10;
            sum = sum + (rightDigit * rightDigit * rightDigit);
            temp = temp / 10;
        }
        return sum == num;
    }
}
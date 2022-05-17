package com.JAVA;


//find factorial of the number by defining the factorial method


import java.util.Scanner;


public class M_5__Q_2 {

    public static long factorial(long n) {
        if (n==0)
            return 0;
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       long n = sc.nextLong();
       for (long i=n;i>=0 ; i--)
        System.out.println(factorial(i));
    }
}

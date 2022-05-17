package com.JAVA;

import java.util.Scanner;

//factorial of a number
public class exercisse_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int product = 1;
        int n = sc.nextInt();
        for (int i =1; i<=n; i++){
            product = product*i;
        }
        System.out.println(n+ "! = "+product);
    }
}

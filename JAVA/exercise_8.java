package com.JAVA;

import java.util.Scanner;

public class exercise_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =1;i<=n;i++){
            System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));
        }

    }
}

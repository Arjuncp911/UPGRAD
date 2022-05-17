package com.JAVA;

//average of three numbers

import java.util.Scanner;


public class exercise_5 {
    public static  double average(double a ,double b, double c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b , c;
        System.out.println("input the first number");
        a= sc.nextInt();
        System.out.println("input the second number");
        b= sc.nextInt();
        System.out.println("input the third number");
        c= sc.nextInt();
        System.out.println(average(a,b,c));

    }

}

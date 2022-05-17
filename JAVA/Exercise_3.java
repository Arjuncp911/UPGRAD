package com.JAVA;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {

        System.out.println("<=======================Asset Tracking System===================>\n\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Tracking Number : ");
        int trackno = sc.nextInt();
        System.out.println("Enter the Name : ");
        String name = sc.next();
        System.out.println("Enter the Value : ");
        float value = sc.nextFloat();


        System.out.println("Tracking Number : " + trackno);
        System.out.println("Name : " + name);
        System.out.println("Value : " + value);
    }
}

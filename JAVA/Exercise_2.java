package com.JAVA;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        System.out.println("<---------------------------------Please Enter Your Order--------------------------------->");
        System.out.println("\n\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Name : ");
        String name = sc.nextLine();
        System.out.println("Please enter Price : ");
        float price = sc.nextFloat();
        System.out.println("Please enter Quantity : ");
        int quantity = sc.nextInt();

        System.out.println("Name of the Customer : " + name);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
    }
}

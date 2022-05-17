package com.JAVA;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {

        int age;
        long aadharno;
        float salary;
        String name;
        String gender;
        String address;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name of the Teacher : ");
        name = sc.next();

        System.out.println("Enter Age : ");
        age = sc.nextInt();

        System.out.println("Enter Gender : ");
        gender = sc.next();

        System.out.println("Enter Aadhar card number : ");
        aadharno = sc.nextLong();

        System.out.println("Enter Address : ");
        address = sc.next();

        System.out.println("Enter Salary: ");
        salary = sc.nextFloat();

        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(aadharno);
        System.out.println(address);
        System.out.println(salary);


    }
}

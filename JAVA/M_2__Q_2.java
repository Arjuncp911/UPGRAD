package com.JAVA;
import java.util.Scanner;


/*Question 2:  A student will not be allowed to sit in exam if his/her
 attendence is less than 75%.Take following input from user Number of classes held Number
  of classes attended. And print percentage of class attended Is student is allowed to sit in exam or not.*/



public class M_2__Q_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int heldClasses , attendClasses;
        heldClasses = sc.nextInt();
        attendClasses = sc.nextInt();
        int percentage = (attendClasses*100)/heldClasses;
        System.out.println(percentage+"%");
        if(percentage>=75)
            System.out.println("student is allowed to sit in exam");
        else
            System.out.println("student is not allowed to sit in exam");

    }
}

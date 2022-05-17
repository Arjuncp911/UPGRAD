package com.JAVA;
 import java.util.Scanner;


 public class M_3__Q_1_number{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();
         int number1 = number;
         int reverse = 0;
         while (number1>0){

             int remainder= number1%10;
             reverse = reverse*10 + remainder;
             number1 = number1/10;
         }

         if (number==reverse) {
             System.out.println("number is pallindrome");
         }
         else {
             System.out.println("number is not a pallindrome");
         }
     }
     }



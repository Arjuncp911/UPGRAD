package com.JAVA;


/* write a program to enter the numbers till the user wants and at the end it shoulddisplay the count of positive negative
 zeros entered*/
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count1=0;
        int count2=0;
        int count3=0;
        char a ;
        do {
            int data = sc.nextInt();
            if (data > 0) {
                count1++;
            }
            else if (data == 0) {
                count2++;
            } else {
                count3++;
            }
            System.out.println("you wanna to play  more y  or n");
            a = sc.next().charAt(0);
        }
        while ( a=='y'|| a=='Y');
        System.out.println("positve no is "+ count1);
        System.out.println("zeros are  "+ count2);
        System.out.println("negative  no is "+ count3);


    }
}

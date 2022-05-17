package com.JAVA;


//Write a Java method to display the middle character of a string.
//
//        Note:
//
//        a) If the length of the string is odd there will be one middle character.
//
//        b) If the length of the string is even there will be two middle characters.
//
//        Test Data:
//
//        Input a string: 350
//
//        Expected Output:
//
//        The middle character in the string: 5

import java.util.Scanner;

public class M_4__Q_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(midChar( s));
    }

    public static String midChar(String str) {
        int l = str.length();
        int index = -1 ;
        int count = 0 ;
        if (l % 2 == 0) {
            index = (l / 2) - 1;
            count = 2;
        } else {
            index = l / 2;
            count = 1;
        }
        return str.substring(index, index + count);
    }
}






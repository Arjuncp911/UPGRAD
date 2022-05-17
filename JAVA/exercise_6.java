package com.JAVA;


//count all the letters in the string

import java.util.Scanner;

public class exercise_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String str = sc.nextLine();
        for (int i =0; i<str.length();i++){
            if (Character.isLetter(str.charAt(i)))
                count++;
        }
        System.out.println(count);
    }
}

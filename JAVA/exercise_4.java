package com.JAVA;

import java.util.Scanner;

public class exercise_4 {
    public static void main(String[] args) {
        String str;
        int count = 0;

        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char check = str.charAt(i);
            if (check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}

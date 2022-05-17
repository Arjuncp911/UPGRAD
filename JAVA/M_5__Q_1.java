package com.JAVA;

import java.util.Random;
import java.util.Scanner;

//random number game

public class M_5__Q_1 {
    public static void main(String[] args) {
        final int MAX = 100;
        Scanner sc = new Scanner(System.in);
        Random obj = new Random();
        int answer = obj.nextInt(MAX) + 1;


        while (true) {
            System.out.println("Guess a number between 1 to 100");
            int guess = sc.nextInt();
            if (guess > answer) {
                System.out.println("Too high, try again");
            } else if (guess < answer) {
                System.out.println("Too low, try again");
            }
            else {
                System.out.println("congratulations yes you guesed the number");
            break;
            }
        }

    }
}

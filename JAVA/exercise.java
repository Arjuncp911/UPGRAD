package com.JAVA;

/* WRITE A JAVA METHOD TO COMPUT THE SUM OF THE DIGITS IN AN INTEGER TEST DATA INPUT 25 EXPECTED OUTPUT 7*/

public class exercise{
    public static int sum (int a){
        int sum =0;

        while(a>0){
            int last_digit = a%10;
            sum = sum + last_digit;
            a=a/10;
        }
        return sum;

    }
    public static void main(String[] args) {

        int a;
        System.out.println(exercise.sum(25));

    }
}

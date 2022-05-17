package com.JAVA;

import java.util.Scanner;

/* you will be given the array of n integers and you have to print "true"  if there is duplicate element in the array otherwise
print false */

public class test_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println(" enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0;i<n;i++){
            for (int j =i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    count++;
                }
            }
        }
        if (count>0){
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
}

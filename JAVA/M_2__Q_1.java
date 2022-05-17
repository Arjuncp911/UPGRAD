package com.JAVA;

import java.util.Scanner;

public class M_2__Q_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x, y, z;
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        if (x>y){
            if(x>z)
                System.out.println(x);
            else
                System.out.println(z);
        }
        else
            if(y>z)
                System.out.println(y);
            else
                System.out.println(z);
    }
}

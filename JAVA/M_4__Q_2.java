package com.JAVA;

import java.util.Scanner;

public class M_4__Q_2 {
        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            double a=sc.nextDouble();
            double b=sc.nextDouble();
            double c=sc.nextDouble();
            if(a+b>c && a+c>b && c+b> a)
            {
                System.out.println(Area(a,b,c));
            }
            else
            {
                System.out.println("sides are nit valid");
            }

        }
        public static double Area(double a,double b,double c){
            double s=(a+b+c)*0.5;

            return Math.sqrt(s*(s-a)*(s-b)*(s-c));
        }
    }


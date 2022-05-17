package com.JAVA;

/* write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively
 by creating a class named 'rectangle' with a method named 'Area' which returns the area and length and breadth passed
 as parameters to its constructor*/




class Rectangle{
    private int length;
    private int breadth;
    Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
  public   int Area(){
        return length*breadth;
    }
}

public class oops_2 {
    public static void main(String[] args) {
        Rectangle obj=new Rectangle(4,5);
        Rectangle obj1=new Rectangle(5,8);
        System.out.println(obj.Area());
        System.out.println(obj1.Area());
    }
}

package com.JAVA;

/* write a program that would print the information (name ,year of joining ,address)
 of three employees by creating a class named 'Employee'. The output should be as follows
 Robert   1994   64C wallstreat
 sam      2000   68D  wallstreat
 john     1999   26B  wallsreat
*/


class Employees{
    private String name;
    private int year;

    private String Address;
    Employees(String name,int year,String Address){
        this.name=name;
        this.year=year;
        this.Address=Address;
    }
    public String toString(){       // toString method will automatically call by writing only obj of that class
        return this.name+"  "+this.year+"  "+this.Address;

    }
}

public class oops_1 {
    public static void main(String[] args) {

            Employees e1=new Employees("Robert",1994,"64C-wallstreat");
            Employees e2=new Employees("sam" ,   2000,"68D-wallstreat");
            Employees e3=new Employees("john",  1999,"26B-wallsreat");
            System.out.println(e1);
            System.out.println(e2);
            System.out.println(e3);
        }
    }


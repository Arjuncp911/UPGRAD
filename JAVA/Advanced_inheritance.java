package com.JAVA;

class Member{
    String name ,address,phone;
    int age;
    Long salary;


    Member(String name,int age,String pn,String add,Long sal)
    {
        this.name=name;
        this.age=age;
        phone=pn;
        address=add;
        salary=sal;
    }
    public  void printSalary(){
        System.out.println(salary);
    }
    public void printName(){
        System.out.println(name);
    }
}

class Employee extends Member
{
    String specialization;
    Employee(String n,int a,String b,String h,long sal,String spe)
    {
        super(n,a,b,h,sal);
        specialization=spe;
    }
}
class Manager extends Member
{

    String department;
    Manager(String n,int a,String b,String h,long sal,String spe)
    {
        super(n,a,b,h,sal);
        department=spe;
    }
}

public class Advanced_inheritance {

    public static void main (String[] args) {
        Employee obj=new Employee("Ashish",82,"8434261111","Bihar",100000,"Full Stack");

        obj.printSalary();
        obj.printName();
        Manager obj1=new Manager("ARJUN",82,"8434261111","Bihar",1100000000,"IT");

        obj1.printSalary();
        obj1.printName();
    }
}

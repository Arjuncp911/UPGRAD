package com.JAVA;

class shape{
    public void print(){
        System.out.println("This is shape");
    }
}
class rectangle extends  shape{
    public void print(){
        super.print();
        System.out.println("This is rectangle shape");
    }
}
class circle extends  shape{
    public void print(){
        System.out.println("This is circle shape");
    }
}
class square extends  rectangle{
    public void print_square(){
        System.out.println("square is rectangle");
    }
}

public class inheritance_2 {
    public static void main(String[] args) {
        square obj = new square();
       obj.print();
       obj.print_square();

    }
}

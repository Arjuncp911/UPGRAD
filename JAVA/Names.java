package com.JAVA;



class Author {
    private String First_Name, Last_Name;

    Author(String First_Name, String Last_Name) {
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;

    }

    public void setFirstName(String firstName) {
        First_Name = firstName;
    }


    public void setLastName(String lastName) {
        Last_Name = lastName;
    }

    public String getFirstName() {
        return Last_Name;
    }

    public String getLastName() {
        return First_Name;
    }

    public String toString() {
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        return First_Name + " " + Last_Name;
    }
}

    class Book {
        private String title_Book, Author_Name;
        private int price_book;

        Book(String title_Book, String Author_Name, int price_book) {
            this.title_Book = title_Book;
            this.Author_Name = Author_Name;
            this.price_book = price_book;
        }

        public void setTitle(String title) {
            title_Book = title;
        }

        //: Used to set the title of book.
        public void setAuthor(String author) {
            Author_Name = author;
        }// Used to set the name of author of book.

        public void setPrice(int price) {
            this.price_book = price;
        }//: Used to set the price of book.

        public String getTitle() {
            return title_Book;
        }
        public String toString() {
            this.title_Book = title_Book;
            this.Author_Name=Author_Name;
            this.price_book = price_book;
            return title_Book+ " " + Author_Name + " " + price_book;
        }

    }


    public class Names {

    public static void main(String[] args) {
        Author obj = new Author ("Arjun" , "panchal");
        System.out.println(obj);

        Book obj1 = new Book ("gita" , obj.toString(),100 );
        System.out.println(obj1);

    }
}

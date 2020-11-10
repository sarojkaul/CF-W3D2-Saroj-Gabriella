package Gabriella.Library;

import java.util.ArrayList;

public class TestDriver {

    public static void main(String[] args) {

        ArrayList<Author> authors1 = new ArrayList<>();
        ArrayList<Author> authors2 = new ArrayList<>();
        ArrayList<Author> authors3 = new ArrayList<>();
        ArrayList<Author> authors4 = new ArrayList<>();
        ArrayList<Author> authors5 = new ArrayList<>();


        authors1.add(new Author("Sharon Zakhour","sharon.zakhour@oracle.com", 'f', "instagram.com/author/Zakhour"));
        authors2.add(new Author("Dan Brown","dan.brown@symbol.com", 'm', "instagram.com/author/Brown"));
        authors3.add(new Author("Marc Elsberg",
                "marc.elsberg@blalba.at", 'm', "instagram.com/author/Elsberg"));
        authors4.add(new Author("Sandberg Ellen",
                "sandberg.ellen@spass.com", 'f', "instagram.com/author/Sandberg"));
        authors5.add(new Author("Robert Martin",
                "robert.martin@javaguru.com", 'm', "instagram.com/author/Martin"));
        authors1.add(new Author("Scott Hommel","scott.hommel@oracle.com", 'm', "instagram.com/author/Hommel"));
        authors1.add(new Author("Jacob Royal","jacob.royal@oracle.com", 'm', "instagram.com/author/Royal"));
        authors1.add(new Author("Isaac Rabinovitch","isaac.rabinovitch@oracle.com", 'm', "no instagram"));
        authors1.add(new Author("Tom Risser","tom.risser@oracle.com", 'm', "no instagram"));
        authors1.add(new Author("Mark Hoeber","mark.hoeber@oracle.com", 'm', "no instagram"));

        ArrayList<Book> books= new ArrayList<>();
        books.add(new Book("The Java Tutorial",authors1,69.90,100));
        books.add(new Book("Gier, how far do you want to go",authors3,29.90,1000));
        books.add(new Book("Da Vinci Code",authors2,20.00,200));
        books.add(new Book("Die Schweigende",authors4,12.99,500));
        books.add(new Book("GREED",authors3,69.90,100));
        books.add(new Book("Clean Code",authors5,28.55,500));


        System.out.println("*******Printing the name of a book from a Book instance****");

        books.get(5).printTitle();

        System.out.println("******Printing the name and email from an author from a Book instance.***");
        System.out.println("Name of Author: "+books.get(3).getAuthorName(0)+ "   Email: "+books.get(3).getAuthorEmail(0));


        //     Create a method in the Book class to display only the author details of a book in a nicely formatted way.
        books.get(3).printBookAuth();

        System.out.println(books.get(0).getAuthorNameString());

        //print the name of one Author of specific book
        System.out.println(authors1.get(0).getAuthorName());
        System.out.println("list of authors for Java book**************");
        books.get(0).printAuthorList();

        System.out.println(books.get(2));

        System.out.println(authors1);

        System.out.println("*****list  book object with using to string method********");
        System.out.println(books.get(0));

    }






}

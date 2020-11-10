package Gabriella.Library;

import java.util.*;

public class Book {

      private String title;
      private ArrayList<Author>  authors = new ArrayList<>();                                           //Author author;
      private double price;
      private int quantity;


    public Book(String title, ArrayList<Author> authors, double price, int quantity) {
        this.title = title;
        this.authors = authors;
        this.price = price;
        this.quantity = quantity;
    }



    public Book(String title, ArrayList<Author> authors, double price) {
        this.title = title;
        this.authors = authors;
        this.price = price;

    }

    //printing the name of the book!
    public String getTitle() {
        return title;
    }
    public void printTitle(){
        System.out.println("Title: "+this.title);
    }




    public void setTitle(String name) {
        this.title = title;
    }

    public ArrayList<Author> getAuthor() {

        return new ArrayList<Author>(this.authors);
    }

    public void setAuthor(ArrayList authors) {
        this.authors = authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + this.getAuthorString() +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';

    }

    //additional Methods  to get info about the Author
    public String getAuthorString(){
        String listOfAuthors="{ Author List= ";
        for (Author element: authors) {
            //int i=authors.indexOf(element);
            listOfAuthors=listOfAuthors+this.authors.get(authors.indexOf(element)).toString()+"\n";
        }
        listOfAuthors = listOfAuthors+" }";
        return listOfAuthors;
    }

    // print the author
    public void printBookAuth(){
        for (Author element: authors) {
            //int i=authors.indexOf(element);
            this.authors.get(authors.indexOf(element)).printAuthorName();
        }
    }

    public String getAuthorNameString(){
        String listOfAuthorNames="";
        for (Author element: authors) {
            //int i=authors.indexOf(element);
            listOfAuthorNames=listOfAuthorNames+this.authors.get(authors.indexOf(element)).getAuthorName();
        }
        return listOfAuthorNames;
    }

    public void printAuthorList(){
        String listOfAuthors="";
        System.out.println("Authors: ");
        for (Author element: authors) {
            //int i=authors.indexOf(element);

            if(authors.indexOf(element)+1 == authors.size()){
                System.out.print(this.authors.get(authors.indexOf(element)).getAuthorName());
            }else {
                System.out.print(this.authors.get(authors.indexOf(element)).getAuthorName()+", ");
            }
        }

    }

    public String getAuthorName(int i){
        return this.authors.get(i).getAuthorName();
    }
    public String getAuthorEmail(int i){
        return this.authors.get(i).getEmail();
    }

    public char getAuthorGender(int i){
        return this.authors.get(i).getGender();
    }

    public String getAuthorInstagram(int i){
        return this.authors.get(i).getInstagram();
    }







}


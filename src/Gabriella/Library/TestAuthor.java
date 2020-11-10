package Gabriella.Library;

import java.util.ArrayList;

public class TestAuthor {
    public static void main(String[] args) {

        Author auth1 = new Author("Sharon Zakhour",
                "sharon.zakhour@oracle.com", 'f', "instagram.com/author/Zakhour");
        Author auth2 = new Author("Dan Brown",
                "dan.brown@symbol.com", 'm', "instagram.com/author/Brown");
        Author auth3 = new Author("Marc Elsberg",
                "marc.elsberg@blalba.at", 'm', "instagram.com/author/Elsberg");
        Author auth4 = new Author("Sandberg Ellen",
                "sandberg.ellen@spass.com", 'f', "instagram.com/author/Sandberg");

        System.out.println("Hey!");
        System.out.println("Email: "+auth1.getEmail());


    }





    //authorList = new Author("abc", "abc@abc.com", "m", "instagram.com/author");

    //System.out.println(“the email is: “ + author.getEmail());


}

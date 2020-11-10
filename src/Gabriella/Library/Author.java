package Gabriella.Library;

public class Author {

    private String authorName;
    private String email;
    private char gender;           //"m" or "f"
    private String instagram;

    public Author(String authorName, String email, char gender, String instagram) {
        this.authorName = authorName;
        this.email = email;
        this.gender = gender;
        this.instagram = instagram;
    }

    //print author data
    public void printAuthorName(){
        System.out.println("Author: "+this.authorName+"  Email: "+this.email+"  Instagram: "+this.instagram);

    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthor(String author) {
        this.authorName = authorName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }


    @Override
    public String toString() {
        return "Author{" +
                "author='" + authorName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", instagram='" + instagram + '\'' +
                '}';
    }
}

import java.util.ArrayList;

public class Author {

    /**
     * WORK ON BOOK CLASS FIRST
     * Create a custom constructor that will take 6 args and defines the Author object
     * Define Author class fields as firstName, lastName, country, isAlive, age, list of books
     */

    //Create 6 args custom constructor here
    //YOUR CODE HERE
    public Author(String firstName, String lastName, String country, boolean isAlive, int age, ArrayList<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.isAlive = isAlive;
        this.age = age;
        this.books = books;
    }

    /*
        Define instance variables here
        NOTE: Books must be defined as a List of Objects of Book class not String
    */
    //YOUR CODE HERE
    String firstName;
    String lastName;
    String country;
    boolean isAlive;
    int age;
    ArrayList<Book> books;


    /*
    Override toString() method here that returns Author object information
     */
    //YOUR CODE HERE


    @Override
    public String toString() {
        return "Author{" +
                (firstName == null ? "" : "first name ='" + firstName + '\'') +
                (lastName == null ? "" : "last name ='" + lastName + '\'') +
                (country == null ? "" : "country ='" + country + '\'') +
                isAlive + '\'' +
                (!isAlive ? "" : ", age=" + age)
                + "}";
    }
}

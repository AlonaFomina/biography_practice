import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Biography {
    public static void main(String[] args) {

        /**
         * WORK ON BOOK AND AUTHOR CLASSES FIRST
         This will be our actual program that we define author and his books
         In this program we will write the biography of Stefan Zweig, an Austrian novelist.


         Write a program that will get information from user and
         -Print information for the favorite author
         -Print information of the books of favorite author

         Full name = Stefan Zweig
         County = Austria
         Is still alive: No (28 November 1881 – 22 February 1942)
         Some of his books as listed below:

         BookName                            Genre           TotalPage
         Amok                                tale            189
         The Royal Game                      novella         53
         24 Hours in the Life of a Woman     novella         80
         */

        /*
        Expected result:
        Author's information = Author{firstName='Stefan', lastName='Zweig', country='Austria', isAlive=false}
        Author's books are as listed below:
        Book{name='Amok', genre:'tale', page=189}
        Book{name='The Royal Game', tale='novella', page=53}
        Book{name='24 Hours in the Life of a Woman', tale='novella', page=80}
         */

        //YOUR CODE HERE

        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your favorite author’s first name?");
        String name = userInput.next();


        System.out.println("What is your favorite author’s last name?");
        String lastName = userInput.next();


        System.out.println("Where is your favorite author from?");
        String country = userInput.next();

        System.out.println("Is your favorite author alive? Y/N");
        boolean isAlive = userInput.next().toLowerCase().startsWith("y");

        int age = 0;
        if (isAlive) {
            System.out.println("How old is the author?");
            age = userInput.nextInt();
        }


        ArrayList<Book> books = new ArrayList<>();

        do {
            System.out.println("Would you like enter book information? (Y/N)");
            String bookInfo = userInput.next();

            if (bookInfo.toLowerCase().startsWith("n"))continue;

            System.out.println("What is the book name?");
            String bName = userInput.next();

            System.out.println("What is genre of the book?");
            String genre = userInput.next();

            System.out.println("How many pages does book have?");
            int pages = userInput.nextInt();

            Book book = new Book(bName, genre, pages);
            books.add(book);
        } while (books.size() < 3);

            Author author = new Author(name, lastName, country, isAlive, age, books);

        System.out.println("Author's information = " + author);
        System.out.println("Author's books are as listed below:");

        for (Book book : author.books) {
            System.out.println(book);

        }
        }
    }


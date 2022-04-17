import java.util.ArrayList;
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

        Author author = new Author(null, null, null, false, 0);
        ArrayList<Book> books = new ArrayList<>();




        Scanner input = new Scanner(System.in);
        System.out.println("What is your favorite author's first name?");
        author.firstName = input.next();
        System.out.println("What is your favorite author's last name?");
        author.lastName = input.next();
        System.out.println("Where is your favorite author from?");
        author.country = input.next();
        System.out.println("Is your favorite author still alive?");
        String answer = input.next();
        if (answer.toLowerCase().startsWith("y")){
            author.isAlive = true;
            System.out.println("What is your favorite author's age?");
            author.age = input.nextInt();
        }
        do{
            System.out.println("Would you like to enter info about a book from that author?");
            String response = input.next();
            if (response.toLowerCase().startsWith("y")){

                Book.addBooks();
                System.out.println("What is the name of the book?");
                input.nextLine();
                String name = input.nextLine();
                System.out.println("What is the genre of the book?");
                String genre = input.nextLine();
                System.out.println("How many pages does the book have?");
                int pages = input.nextInt();
                Book book = new Book(name, genre, pages);
                books.add(book);
            }
        }while (Book.totalAmountOfBooks < 3);

        System.out.println(author);
        for (Book element : books){
            System.out.println(element);
        }









    }
}

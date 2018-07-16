package Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        List<Books> library = new ArrayList<Books>();

        Books book1 = new Books ("Book1", "AuthorToFind", 2018, 12.6);
        Books book2 = new Books ("Book2", "Author2", 2015, 25.3);
        Books book3= new Books ("Book3", "AuthorToFind", 2013, 180.1);
        Books book4 = new Books ("Book4", "Author4", 2016, 9.99);
        Books book5 = new Books ("Book5", "AuthorToFind", 2014, 903);
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.add(book5);

        Set<Books> result = findByAuthor(library, "AuthorToFind");
        for(Books bookFromResult : result) {
            System.out.println("Title = " + bookFromResult.getTitle ()+ ", Author = "+ bookFromResult.getAuthor ()+ ", price = $" + bookFromResult.getPrice() + ", year = " + bookFromResult.getYear());
        }
    }


    public static Set<Books> findByAuthor(List<Books> library, String author) {
        Set<Books> sortedBooks = new TreeSet<Books>(new ComparatorNew());

        for(Books book : library) {

            if (book.getAuthor().equals(author)) {
                sortedBooks.add(book);

            }
        }

        return sortedBooks;
    }


}

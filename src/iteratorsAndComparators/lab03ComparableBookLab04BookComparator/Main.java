package iteratorsAndComparators.lab03ComparableBookLab04BookComparator;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Animal Farm", 2003, "George Orwell");
        Book book3 = new Book("The Documents in the Case", 2002);
        Book book2 = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book3);
        bookList.add(book2);

        bookList.sort(new BookComparator());


        for (Book element: bookList) {
            System.out.printf("%s %d %s%n",
                    element.getTitle(), element.getYear(), element.getAuthors());
        }
    }
}

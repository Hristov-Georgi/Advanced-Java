package iteratorsAndComparators.lab03ComparableBookLab04BookComparator;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    public int compare(Book book1, Book book2) {

        int compare = book1.getTitle().compareTo(book2.getTitle());

        if(compare == 0) {
            compare = Integer.compare(book1.getYear(), book2.getYear());
        }

        return compare;

    }
}

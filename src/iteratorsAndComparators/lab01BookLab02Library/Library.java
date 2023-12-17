package iteratorsAndComparators.lab01BookLab02Library;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library implements Iterable<Book>{

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void add(Book book) {
        this.books.add(book);
    }

    public Book get(int index) {
        return this.books.get(index);
    }

    public int size() {
        return this.books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibIterator();
    }

    private class LibIterator implements Iterator<Book> {

        private int startBook = 0;

       @Override
        public boolean hasNext() {
           return startBook < books.size();

       }

       @Override
        public Book next() {
           Book nextBook = books.get(startBook);
           startBook++;
           return  nextBook;
       }

    }
}

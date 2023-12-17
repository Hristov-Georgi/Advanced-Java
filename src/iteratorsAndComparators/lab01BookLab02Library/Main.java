package iteratorsAndComparators.lab01BookLab02Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book book1 = new Book("Animal Farm", 2003, "George Orwell");
        Book book3 = new Book("The Documents in the Case", 2002);
        Book book2 = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        Library library = new Library();

        library.add(book1);
        library.add(book3);
        library.add(book2);

        for(Book book : library) {
            System.out.println(book.getTitle());
        }

    }
}

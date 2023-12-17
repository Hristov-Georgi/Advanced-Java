package iteratorsAndComparators.ex01ListyIteratorEx02Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ListyIterator implements Iterable<String> {

    private List<String> elements;
    private int index;

    public ListyIterator(String... elements) {
        this.setElements(elements);
        this.index = 0;
    }

    private void setElements(String... elements) {
        this.elements = Arrays.stream(elements).collect(Collectors.toList());
    }

    public boolean hasNext() {
        return this.index < this.elements.size() -1;
    }

    public boolean move() {

        if(hasNext()) {
            this.index++;
            return true;
        }
        return false;
    }

    public void print() {

        try {
            System.out.println(this.elements.get(this.index));
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Invalid Operation!");
        }
    }

    public void printAll() {
        this.elements.forEach(e -> System.out.printf("%s ", e));
        System.out.println();
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {

            private int startIndex = 0;

            @Override
            public boolean hasNext() {
                return startIndex < elements.size();
            }

            @Override
            public String next() {
                String currentElement = elements.get(startIndex);
                startIndex++;
                return currentElement;
            }
        };
    }

    @Override
    public void forEach(Consumer<? super String> el) {
        this.elements.forEach(el::accept);
    }

}

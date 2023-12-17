package iteratorsAndComparators.ex03StackIterator;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;


public class Stack implements Iterable<Integer> {

    private List<Integer> intList;

    public Stack() {
        this.intList = new ArrayList();
    }

    public List<Integer> getIntList() {
        return this.intList;
    }

    public void push(int number) {
        this.intList.add(number);
    }

    public Object pop() {
            return this.intList.remove(this.intList.size() - 1);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            private int index = intList.size() -1;

            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @Override
            public Integer next() {
                int currentNumber = intList.get(index);
                index--;
                return currentNumber;
            }
        };
    }

    @Override
    public void forEach(Consumer<? super Integer> el){
       this.intList.forEach(el::accept);
    }


}

package generics.ex07AndEx08CustomListSorter;

import java.util.List;
import java.util.ArrayList;

public class CustomList<T extends Comparable<T>> {

    private List<T> list;

    public CustomList() {
        this.list = new ArrayList<>();
    }

    public List<T> getList() {
        return list;
    }

    public void add (T element) {
        this.list.add(element);
    }

    public void remove (int index) {
        this.list.remove(index);
    }

    public boolean contains (T element) {
        return this.list.contains(element);
    }

    public void swap (int firstIndex, int secondIndex) {
        T first = this.list.get(firstIndex);
        T second = this.list.get(secondIndex);

        this.list.set(secondIndex, first);
        this.list.set(firstIndex, second);
    }

    public int countGreaterThan (T element) {

        int counter = 0;

        for (T el : this.list) {
            if (el.compareTo(element) > 0) {
                counter++;
            }
        }
        return counter;
    }

    public T getMax() {

        return this.list.stream().max((e1, e2) -> e1.compareTo(e2)).get();

    }

    public T getMin() {

        return this.list.stream().min((e1, e2) -> e1.compareTo(e2)).get();

    }

    public void print () {
        for (T element : this.list ) {
            System.out.println(element);
        }
    }


}





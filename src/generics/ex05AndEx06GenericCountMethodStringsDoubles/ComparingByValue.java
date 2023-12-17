package generics.ex05AndEx06GenericCountMethodStringsDoubles;

import java.util.List;
import java.util.ArrayList;

public class ComparingByValue<T extends Comparable<T>> {

    private List<T> list;

    public ComparingByValue () {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        this.list.add(element);
    }

    public int greaterElementsCount (T valueToCompare) {

        int elementsCounter = 0;

        for (T element : this.list) {
            if (element.compareTo(valueToCompare) > 0) {
                elementsCounter++;
            }
        }

        return elementsCounter;
    }
}

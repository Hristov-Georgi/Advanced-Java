package generics.ex03GenericSwapMethodStringsAndIntegers;

import java.util.List;
import java.util.ArrayList;

public class SwapClass<T> {

    private List<T> stringList;

    public SwapClass() {
        this.stringList = new ArrayList<>();
    }

    public void addElement (T element) {
        this.stringList.add(element);
    }

    public void swap (int firstIndex, int secondIndex)  {
        T firstElement = this.stringList.get(firstIndex);
        T secondElement = this.stringList.get(secondIndex);
        this.stringList.set(firstIndex, secondElement);
        this.stringList.set(secondIndex, firstElement);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (T item : this.stringList) {

            sb.append(item.getClass().getName())
                    .append(": ")
                    .append(item)
                    .append("\n");
        }

        return sb.toString();
    }


}

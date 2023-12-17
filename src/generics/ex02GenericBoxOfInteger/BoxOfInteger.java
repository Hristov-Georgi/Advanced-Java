package generics.ex02GenericBoxOfInteger;

import java.util.ArrayList;
import java.util.List;

public class BoxOfInteger<T> {

    private List<T> list;

    public BoxOfInteger () {
        this.list = new ArrayList<>();
    }

    public void addToList (T number) {
        this.list.add(number);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for(T item : list) {
            stringBuilder
                    .append(item.getClass().getName())
                    .append(": ")
                    .append(item)
                    .append("\n");
        }

        return stringBuilder.toString();
    }
}

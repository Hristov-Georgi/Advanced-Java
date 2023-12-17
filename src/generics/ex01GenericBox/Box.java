package generics.ex01GenericBox;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> input;

    public Box() {
        this.input = new ArrayList<>();
    }

    public void add(T text) {
        this.input.add(text);
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        for (T text : input) {

            String classType = text.getClass().getName();
            stringBuilder.append(classType).append(": ").append(text).append("\n");
        }
        return stringBuilder.toString();
    }


}

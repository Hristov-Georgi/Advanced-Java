package generics.lab04ListUtilities;

import java.util.Collections;
import java.util.List;

public class ListUtils {

    public static<T extends Comparable<T>> T getMin(List<T> list) {
        checkListSize(list);
        return Collections.min(list);
    }

    public static <T extends Comparable<T>> T getMax(List<T> list) {
        checkListSize(list);
        return Collections.max(list);
    }

    private static<T> void checkListSize(List<T> list) {

        if(list.size() == 0) {
            throw new IllegalArgumentException();
        }
    }


 }

package generics.lab04ListUtilities;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> stringList = List.of("23", "43", "22", "11");
        List<Integer> intList = List.of(1,3,44,5,6,7,7788);
        List<String> str = new ArrayList<>();

        System.out.println(ListUtils.getMax(stringList));
        System.out.println(ListUtils.getMin(intList));
        System.out.println(ListUtils.getMax(str));
        System.out.println(ListUtils.getMin(str));

    }
}

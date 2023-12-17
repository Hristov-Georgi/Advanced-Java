package generics.ex07AndEx08CustomListSorter;

public class Sorter {

    public static<T extends Comparable<T>> void sort(CustomList<T> customList) {
        customList.getList().sort((e1, e2) -> e1.compareTo(e2));
    }

}

package generics.lab03GenericScale;

public class Scale<T extends Comparable<T>> {

    private T left;
    private T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getHeavier() {

        int compare = this.left.compareTo(this.right);

        if (compare > 0) {
            return left;
        } else if( compare < 0) {
            return right;
        } else {
            return null;
        }
    }
}

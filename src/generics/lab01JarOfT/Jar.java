package generics.lab01JarOfT;

import java.util.ArrayDeque;

public class Jar <T> {
    private ArrayDeque<T> product;

    public Jar () {
        this.product = new ArrayDeque<>();
    }

    public void add(T element) {
        this.product.push(element);
    }

    public T remove() {
        return this.product.pop();
    }

}

package iteratorsAndComparators.ex04Froggy;

import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {
    private List<Integer> lake;

    public Lake(List<Integer> lake) {
        this.lake = lake;
    }

    public Iterator<Integer> iterator() {
        return new Frog();
    }

    class Frog implements Iterator<Integer> {

        int start = 0;
        boolean firstRoundFinished = false;

        @Override
        public boolean hasNext() {
            return start <= lake.size() - 1;
        }

        @Override
        public Integer next() {
            int stone = lake.get(start);
            start += 2;

            if (start > lake.size() - 1 && !firstRoundFinished) {
                start = 1;
                firstRoundFinished = true;
            }
            return stone;
        }

    }

}

package iteratorsAndComparators.ex06StrategyPattern;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person firstP, Person secondP) {

        return Integer.compare(firstP.getAge(), secondP.getAge());

    }
}

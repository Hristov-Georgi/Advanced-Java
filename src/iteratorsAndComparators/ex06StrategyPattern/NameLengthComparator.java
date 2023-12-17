package iteratorsAndComparators.ex06StrategyPattern;

import java.util.Comparator;

public class NameLengthComparator implements Comparator<Person> {

    @Override
    public int compare(Person firstP, Person secondP) {

        if(firstP.getName().length() == (secondP.getName().length())) {
            return Character.compare(firstP.getName().toLowerCase().charAt(0),
                    secondP.getName().toLowerCase().charAt(0));
        }
        return Integer.compare(firstP.getName().length(), secondP.getName().length());

    }
}

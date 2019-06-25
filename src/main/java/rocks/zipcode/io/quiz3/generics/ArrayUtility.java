package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for (SomeType s : array
             ) {
            if(getNumberOfOccurrences(s) % 2 != 0) {
                return s;
            }
        }

        return null;
    }

    public SomeType findEvenOccurringValue() {

        for (SomeType s : array
        ) {
            if(getNumberOfOccurrences(s) % 2 == 0) {
                return s;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer num = 0;
        for (SomeType value: array
             ) {
            if (value.equals(valueToEvaluate)) {
                num++;
            }
        }
        return num;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
//            SomeType[] arr = Arrays.stream(array).filter(v ->predicate.apply(v)).toArray(size -> Arrays.copyOf(array,size));

        ArrayList<SomeType> a = new ArrayList<>();
        for (SomeType s: array
        ) {
            if(predicate.apply(s)) {
                a.add(s);
            }
        }



        return a.toArray(Arrays.copyOf(array, a.size()));
    }
}

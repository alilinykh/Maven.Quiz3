package rocks.zipcode.io.quiz3.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {

        List<Integer> sq = Arrays.asList(squaredValues);

        Integer counter = 0;
        for (int i = 0; i < inputArray.length ; i++) {
            if(sq.contains(inputArray[i] * inputArray[i])) {counter++;}
        }
        if (counter == squaredValues.length) {return true;}
        else return false;
    }
}

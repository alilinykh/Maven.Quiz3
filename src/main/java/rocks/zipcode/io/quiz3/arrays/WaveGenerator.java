package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        ArrayList<String> result = new ArrayList<>();
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                result.add(str.substring(0, i) + Character.toUpperCase(str.charAt(i)) + str.substring(i + 1));
            }
        }
        String [] arr = new String[result.size()];
        arr = result.toArray(arr);

        return arr;
    }
}

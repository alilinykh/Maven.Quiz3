package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {

        return str.substring(0,indexToCapitalize)  + Character.toUpperCase(str.charAt(indexToCapitalize)) + str.substring(indexToCapitalize + 1);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        if (baseString.charAt(indexOfString) == characterToCheckFor) {return true;}
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        for (int i = 0; i < string.length() ; i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                hashSet.add(string.substring(i,j));
            }
        }
        String[] strings = hashSet.stream().toArray(String[]::new);

        return strings;
    }

    public static Integer getNumberOfSubStrings(String input){
        Integer counter = -1;
        for (int i = 0; i < input.length() ; i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                counter++;
            }
        }
        return counter;

    }
}

package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        char[] chars = {'a','e','i','o','u'};
        for (char c: chars
             ) {
            if (word.contains(String.valueOf(c))) {return true;}
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        Integer index = word.length();
        char[] chars = {'a','e','i','o','u'};
        if (hasVowels(word)) {
            for (char c : chars
            ) {
                if (word.indexOf(c) != -1) {
                    if (index > word.indexOf(c)) {
                        index = word.indexOf(c);
                    }
                }
            }
        }
        if (!hasVowels(word)) {index = -1;}
        return index;
    }


    public static Boolean startsWithVowel(String word) {
        char[] chars = {'a','e','i','o','u'};
        for (char c: chars
             ) {
            if (Character.toUpperCase(word.charAt(0)) == Character.toUpperCase(c)) {return true;}
        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        char[] chars = {'a','e','i','o','u'};
        for (char c : chars
             ) {
            if (Character.toUpperCase(c) == Character.toUpperCase(character)) {return true;}
        }
        return false;
    }
}

package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        if (VowelUtils.startsWithVowel(str)) {
            str =  str + "way";
        }
        if (!VowelUtils.startsWithVowel(str)) {
            char [] chars = str.toCharArray();


        }
        if (!VowelUtils.hasVowels(str)){
            str =  str + "ay";
        }
        return str;
    }
}

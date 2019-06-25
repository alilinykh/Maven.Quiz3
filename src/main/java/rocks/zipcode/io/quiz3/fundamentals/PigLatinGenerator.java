package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String sss = "";
        String[] strings = str.split(" ");
        for (String s: strings
             ) {
            if (VowelUtils.startsWithVowel(str)) {
                s =  s + "way";
            }
            else if (!VowelUtils.startsWithVowel(s)) {
                Integer firstV = VowelUtils.getIndexOfFirstVowel(s);
                if (firstV != -1) {
                    s = s.substring(firstV) + s.substring(0,firstV) + "ay";
                }
                else {
                    s =  s + "ay";
                }
            }
//            if ()
            sss += s;
        }
//        if (VowelUtils.startsWithVowel(str)) {
//            str =  str + "way";
//        }
//        else if (!VowelUtils.startsWithVowel(str)) {
//            Integer firstV = VowelUtils.getIndexOfFirstVowel(str);
//            if (firstV != -1) {
//                str = str.substring(firstV) + str.substring(0,firstV) + "ay";
//            }
//            else {
//                str =  str + "ay";
//            }
//        }

        return sss;
    }
}

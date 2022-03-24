package TmSys.JavaDojo;

import java.util.Arrays;

public class Anagrams {

    public static String check(String stringA, String stringB){

        String[] arrayA = stringA.toLowerCase().split("");
        String[] arrayB = stringB.toLowerCase().split("");

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        if (Arrays.equals(arrayA, arrayB)){
            return "Anagrams";
        } else {
            return "Not Anagrams";
        }

    }
}

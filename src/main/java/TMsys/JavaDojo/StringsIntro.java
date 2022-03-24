package TmSys.JavaDojo;

public class StringsIntro {

    public static String manipulate(String stringA, String stringB){

        String result = "" + (stringA.length() + stringB.length()) + "\n";

        if (stringA.compareTo(stringB) > 0){
            result += "Yes\n";
        } else {
            result += "No\n";
        }


        result += (stringA.substring(0, 1).toUpperCase());
        result += (stringA.substring(1, stringA.length()) + " ");
        result += (stringB.substring(0, 1).toUpperCase());
        result += (stringB.substring(1, stringB.length()));

        return result;
    }

}

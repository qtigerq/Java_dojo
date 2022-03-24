package TmSys.JavaDojo;

public class StringReverse {

    public static String check(String input){

        StringBuilder sequence = new StringBuilder(input);
        String sequenceString = sequence.reverse().toString();

        if (input.equals(sequenceString)){
            return "Yes";
        } else {
            return "No";
        }

    }
}

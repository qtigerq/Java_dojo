package TmSys.JavaDojo;

public class IpPattern {

    public static String check(String input){

        String zeroTo255
                = "(\\d{1,2}|(0|1)\\"
                + "d{2}|2[0-4]\\d|25[0-5])";

        String pattern
                = zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255;

        String[] ips = input.split("\n");

        String result = "";
        for (String item: ips) {
            result += item.matches(pattern) + "\n";
        }

        return result;
    }

}

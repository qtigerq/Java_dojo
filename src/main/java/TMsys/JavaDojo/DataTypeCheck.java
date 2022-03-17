package TmSys.JavaDojo;

import java.math.BigInteger;

public class DataTypeCheck {

    public static void checkType(String[] array) {

        String byteFit;
        String shortFit;
        String intFit;
        String longFit;

        BigInteger byteMin = new BigInteger("-128");
        BigInteger byteMax = new BigInteger("127");
        BigInteger shortMin = new BigInteger("-32768");
        BigInteger shortMax = new BigInteger("32767");
        BigInteger intMin = new BigInteger("-2147483648");
        BigInteger intMax = new BigInteger("2147483647");
        BigInteger longMin = new BigInteger("-9223372036854775808");
        BigInteger longMax = new BigInteger("9223372036854775807");

        for (String item : array) {

            byteFit = "no";
            shortFit = "no";
            intFit = "no";
            longFit = "no";

            BigInteger number = new BigInteger(item);
            String jumpLine = "";
            if (array[array.length - 1] != item) {
                jumpLine = "\n";
            }

            if (number.compareTo(byteMin) >= 0 && number.compareTo(byteMax) <= 0){
                byteFit = "yes";
            }
            if (number.compareTo(shortMin) >= 0 && number.compareTo(shortMax) <= 0) {
                shortFit = "yes";
            }
            if (number.compareTo(intMin) >= 0 && number.compareTo(intMax) <= 0) {
                intFit = "yes";
            }
            if (number.compareTo(longMin) >= 0 && number.compareTo(longMax) <= 0) {
                longFit = "yes";
            }

            if ((byteFit == "no") && (shortFit == "no") && (intFit == "no") && (longFit == "no")) {
                System.out.print(item + " can't be fitted anywhere." + jumpLine);
            } else {
                System.out.println(item + " can be fitted in:");
                if (byteFit.equals("yes")) {
                    System.out.println("* byte");
                }
                if (shortFit.equals("yes")) {
                    System.out.println("* short");
                }
                if (intFit.equals("yes")) {
                    System.out.println("* int");
                }
                if (longFit.equals("yes")) {
                    System.out.print("* long" + jumpLine);
                }
            }
        }
    }
}

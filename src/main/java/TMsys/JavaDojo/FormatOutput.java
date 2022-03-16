package TmSys.JavaDojo;

public class FormatOutput {

    public static String createLine(String string, String number) {

        while (string.length() < 15){
            string += " ";
        }

        while (number.length() < 3){
            number = "0" + number;
        }

        return string += number;

    }

}

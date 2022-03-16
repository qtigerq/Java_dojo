package TmSys.JavaDojo;

public class FormatOutputPrintOut {

    public static void createLine(String string, String number) {

        while (string.length() < 15){
            string += " ";
        }

        while (number.length() < 3){
            number = "0" + number;
        }

        System.out.print(string + number);

    }

}

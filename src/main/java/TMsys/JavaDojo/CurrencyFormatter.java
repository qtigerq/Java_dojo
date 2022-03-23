package TmSys.JavaDojo;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

    public static void currency(String args) {

        Scanner scanner = new Scanner(args);
        String value = scanner.next();
        scanner.close();

        Double number = Double.parseDouble(value);

        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        String currency = format.format(number);
        System.out.println("US: " + currency);

        format = NumberFormat.getCurrencyInstance(Locale.CHINA);
        currency = format.format(number);
        System.out.println("China: " + currency);

        format = NumberFormat.getCurrencyInstance(Locale.TAIWAN);
        currency = format.format(number);
        System.out.println("Taiwan: " + currency);

        format = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        currency = format.format(number);
        System.out.println("Japan: " + currency);

        format = NumberFormat.getCurrencyInstance(Locale.UK);
        currency = format.format(number);
        System.out.println("UK: " + currency);

        format = NumberFormat.getCurrencyInstance(Locale.CANADA);
        currency = format.format(number);
        System.out.print("Canada: " + currency);

    }
}

package TmSys.JavaDojo;

import java.util.Scanner;

public class SimpleArea {

    public static String calcArea(String measurements) {
        Scanner scanner = new Scanner(measurements);
        int width = scanner.nextInt();
        int heigth = scanner.nextInt();

        scanner.close();

        if (width > 0 && heigth > 0){
            return "" + width*heigth;
        } else {
            return "java.lang.Exception: Breadth and height must be positive";
        }

    }
}

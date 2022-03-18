package TmSys.JavaDojo;

import java.util.Scanner;

public class JavaEndOfLine {

    public static void readUntilEOF(String lines) {

        Scanner scanner = new Scanner(lines);

        String line = "";
        int lineNumber = 0;

        while (scanner.hasNextLine()) {
            if (lineNumber != 0) { System.out.print("\n"); }
            lineNumber++;
            line = scanner.nextLine();
            System.out.print(lineNumber + " " + line);
        }

        scanner.close();
    }
}

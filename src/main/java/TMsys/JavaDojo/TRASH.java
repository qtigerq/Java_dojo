package TmSys.JavaDojo;

import java.io.*;
import java.util.*;

public class TRASH {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        while(scanner.hasNextLine()){

            String line = scanner.nextLine();
            String[] words = line.split(" ");
            List<String> uniqueWords = new ArrayList<String>();

            for (String item : words){

                if (!uniqueWords.contains(item)) {
                    uniqueWords.add(item);
                }
            }

            System.out.println(uniqueWords.toString());
        }

    }
}
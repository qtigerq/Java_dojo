package TmSys.JavaDojo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubstringCompare {

    public static void compare(String string, int subStringSize) {

        List<String> subs = new ArrayList<>();

        for (int round = 0; round <= string.length()-subStringSize; round++){
            subs.add(string.substring(round, round+subStringSize));
        }

        Collections.sort(subs);

        System.out.println(subs.get(0));
        System.out.print(subs.get(subs.size()-1));

        StringBuilder x = new StringBuilder();
        String y = "teste";
        y.equals(x);
    }
}

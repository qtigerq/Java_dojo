package TmSys.JavaDojo;

import java.util.List;

public class BirthdayBar {

    public static Integer birthday(List<Integer> chocBar, int squaresIntegersSum, int chocSquares) {

        int result = 0;

            for (int item = 0; item <= chocBar.size() - chocSquares; item++) {

                int sum = 0;
                for (int round = 0; round < chocSquares; round++) { sum += chocBar.get(item + round); }
                if (sum == squaresIntegersSum) { result++; }

            }
        return result;
    }
}
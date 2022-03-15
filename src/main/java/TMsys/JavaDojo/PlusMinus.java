package TmSys.JavaDojo;

import java.text.DecimalFormat;

public class PlusMinus {
    public static Double[] ratio(Integer[] arr) {
        int positives = 0;
        int negatives = 0;
        int zeros = 0;

        for (int item : arr) {
            if (item > 0) {
                positives = positives + 1;
            } else if (item < 0) {
                negatives = negatives + 1;
            } else {
                zeros = zeros + 1;
            }
        }

        double positiveRatio = positives/arr.length;
        double negativeRatio = negatives/arr.length;
        double zeroRatio = zeros/arr.length;

        return new Double[]{positiveRatio, negativeRatio, zeroRatio};
    }
}

package TmSys.JavaDojo;

import java.util.List;

public class BetwennTwoSets {

    public static Integer checkNumbers(List<Integer> a, List<Integer> b){

        int result = 0;

        for (int round = a.get(a.size()-1); round <= b.get(0); round += a.get(a.size()-1)) {

            boolean valid = true;

            for (int item : a) {
                if (round % item != 0) {
                    valid = false;
                }
            }

            for (int item : b) {
                if (item % round != 0) {
                    valid = false;
                }
            }

            if (valid) { result++;}
        }
        return result;
    }
}

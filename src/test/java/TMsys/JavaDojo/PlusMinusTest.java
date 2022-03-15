package TmSys.JavaDojo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlusMinusTest {
    @Test
    public void positiveRatio (){
        Integer[] array = {1, 1, 0, -1};
        Double[] arrayRatio = {0.5, 0.25, 0.25};
        Arrays.equals(arrayRatio, array);
    }
}

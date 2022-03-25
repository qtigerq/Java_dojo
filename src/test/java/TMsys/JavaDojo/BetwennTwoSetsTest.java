package TmSys.JavaDojo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static TmSys.JavaDojo.BetwennTwoSets.checkNumbers;
public class BetwennTwoSetsTest {

    @Test
    public void main(){
        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(4);
        List<Integer> b = new ArrayList<>();
        b.add(16);
        b.add(32);
        b.add(96);
        assertEquals(3, checkNumbers(a, b));
    }

    @Test
    public void main2(){
        List<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(4);
        List<Integer> b = new ArrayList<>();
        b.add(24);
        b.add(48);
        assertEquals(2, checkNumbers(a, b));
    }
}

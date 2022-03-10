package TiagoMelo.demo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleSumTest {

    @Test
    public void sumList (){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        assertEquals(3, SimpleSum.sum(list));
    }
}

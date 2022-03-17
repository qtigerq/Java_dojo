package TiagoMelo.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTwoArgsTest {

    @Test
    public void sumTwoArgs (){
        String[] array = {"1", "2"};
        assertEquals(3, TiagoMelo.demo.SumTwoArgs.sum(array));
    }

}

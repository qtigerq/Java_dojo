package TmSys.JavaDojo;

import org.junit.jupiter.api.Test;

import static TmSys.JavaDojo.SimpleArea.calcArea;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleAreaTest {

    @Test
    public void out() {
        assertEquals("50", calcArea("5\n10"));
    }
}
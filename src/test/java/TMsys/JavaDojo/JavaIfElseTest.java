package TmSys.JavaDojo;

import org.junit.jupiter.api.Test;

import static TmSys.JavaDojo.JavaIfElse.check;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaIfElseTest {

    @Test
    public void isWeird (){
        assertEquals("Weird", check(1));
    }

    @Test
    public void isNotWeird (){
        assertEquals("Not Weird", check(2));
    }
}

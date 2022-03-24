package TmSys.JavaDojo;

import org.junit.jupiter.api.Test;

import static TmSys.JavaDojo.StringReverse.check;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReverseTest {

    @Test
    public void palindrome(){
        assertEquals("Yes",check("madam"));
        assertEquals("Yes",check("ovo"));
        assertEquals("No",check("Hello Word"));
    }
}

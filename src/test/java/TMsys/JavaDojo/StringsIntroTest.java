package TmSys.JavaDojo;

import org.junit.jupiter.api.Test;
import static TmSys.JavaDojo.StringsIntro.manipulate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringsIntroTest {

    @Test
    public void main(){
        assertEquals("10\n" +
                "No\n" +
                "Hello World",manipulate("hello", "world"));
        assertEquals("9\n" +
                "No\n" +
                "Good Night",manipulate("good", "night"));
    }
}

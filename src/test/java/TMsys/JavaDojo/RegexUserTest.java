package TmSys.JavaDojo;

import org.junit.jupiter.api.Test;
import static TmSys.JavaDojo.RegexUser.checkRegex;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegexUserTest {

    @Test
    public void main(){
        assertEquals("Invalid\n" +
                "Valid\n" +
                "Valid\n" +
                "Invalid\n" +
                "Invalid\n" +
                "Valid\n" +
                "Invalid\n" +
                "Invalid",
                checkRegex("Julia\n" +
                "Samantha\n" +
                "Samantha_21\n" +
                "1Samantha\n" +
                "Samantha?10_2A\n" +
                "JuliaZ007\n" +
                "Julia@007\n" +
                "_Julia007"));
    }

}

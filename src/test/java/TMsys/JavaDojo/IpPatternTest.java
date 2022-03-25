package TmSys.JavaDojo;

import org.junit.jupiter.api.Test;

import static TmSys.JavaDojo.IpPattern.check;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IpPatternTest {

    @Test
    public void main(){
        assertEquals("true\n" +
                "true\n" +
                "true\n" +
                "false\n" +
                "false\n" +
                "false\n",
                check("000.12.12.034\n" +
                "121.234.12.12\n" +
                "23.45.12.56\n" +
                "00.12.123.123123.123\n" +
                "122.23\n" +
                "Hello.IP"));
    }

}

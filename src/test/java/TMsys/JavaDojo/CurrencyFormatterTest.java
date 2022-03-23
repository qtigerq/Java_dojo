package TmSys.JavaDojo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static TmSys.JavaDojo.CurrencyFormatter.currency;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CurrencyFormatterTest {

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setStreams() {
        System.setOut(new PrintStream(out));
    }

    @AfterEach
    public void restoreInitialStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void out() {
        currency("12324.134");
        assertEquals(
                "US: $12,324.13\r\n" +
                        "China: ¥12,324.13\r\n" +
                        "Taiwan: $12,324.13\r\n" +
                        "Japan: ￥12,324\r\n" +
                        "UK: £12,324.13\r\n" +
                        "Canada: $12,324.13",
                out.toString());
    }

}

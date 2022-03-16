package TmSys.JavaDojo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static TmSys.JavaDojo.JavaLoops.printMultiples;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaLoopsTest {

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
        printMultiples(2);
        assertEquals("" +
                "2 x 1 = 2\r\n" +
                "2 x 2 = 4\r\n" +
                "2 x 3 = 6\r\n" +
                "2 x 4 = 8\r\n" +
                "2 x 5 = 10\r\n" +
                "2 x 6 = 12\r\n" +
                "2 x 7 = 14\r\n" +
                "2 x 8 = 16\r\n" +
                "2 x 9 = 18\r\n" +
                "2 x 10 = 20", out.toString());
    }
}

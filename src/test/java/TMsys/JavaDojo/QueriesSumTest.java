package TmSys.JavaDojo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static TmSys.JavaDojo.QueriesSum.printQueriesLines;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueriesSumTest {

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
        Integer[][] array = {{0, 2, 10}, {5, 3, 5}};
        printQueriesLines(array);
        assertEquals(
                "2 6 14 30 62 126 254 510 1022 2046\r\n" +
                        "8 14 26 50 98",
                out.toString());
    }
}
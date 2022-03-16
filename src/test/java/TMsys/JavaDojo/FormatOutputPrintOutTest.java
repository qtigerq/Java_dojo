package TmSys.JavaDojo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static TmSys.JavaDojo.FormatOutputPrintOut.createLine;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormatOutputPrintOutTest {

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
    public void out1() {
        createLine("Java", "35");
        assertEquals("Java           035", out.toString());
    }

    @Test
    public void out2() {
        createLine("Cpp", "100");
        assertEquals("Cpp            100", out.toString());
    }
}

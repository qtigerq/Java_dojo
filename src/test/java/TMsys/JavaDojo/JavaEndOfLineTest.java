package TmSys.JavaDojo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static TmSys.JavaDojo.JavaEndOfLine.readUntilEOF;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaEndOfLineTest {

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
        String lines = (
                "Hello World\n" +
                "I am a file\n" +
                "Read me until end-of-file.") ;
        readUntilEOF(lines);
        assertEquals(
                "1 Hello World\n" +
                        "2 I am a file\n" +
                        "3 Read me until end-of-file.", out.toString());
    }
}

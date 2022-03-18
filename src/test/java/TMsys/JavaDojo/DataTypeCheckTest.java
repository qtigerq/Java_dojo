package TmSys.JavaDojo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static TmSys.JavaDojo.DataTypeCheck.checkType;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTypeCheckTest {

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
        String[] array = {
                "9223372036854775808",
                "9223372036854775807",
                "-9223372036854775808",
                "-9223372036854775807",
                "4294967296",
                "4294967295",
                "-4294967296",
                "-4294967295",
                "65536",
                "65535",
                "-65536",
                "-65535",
                "256",
                "255",
                "-256",
                "-255",
                "12222222222222222222222222222222222222222221"};

        checkType(array);
        assertEquals(
                "9223372036854775808 can't be fitted anywhere.\n" +
                "9223372036854775807 can be fitted in:\n" +
                "* long\n" +
                "-9223372036854775808 can be fitted in:\n" +
                "* long\n" +
                "-9223372036854775807 can be fitted in:\n" +
                "* long\n" +
                "4294967296 can be fitted in:\n" +
                "* long\n" +
                "4294967295 can be fitted in:\n" +
                "* long\n" +
                "-4294967296 can be fitted in:\n" +
                "* long\n" +
                "-4294967295 can be fitted in:\n" +
                "* long\n" +
                "65536 can be fitted in:\n" +
                "* int\n" +
                "* long\n" +
                "65535 can be fitted in:\n"  +
                "* int\n" +
                "* long\n" +
                "-65536 can be fitted in:\n" +
                "* int\n" +
                "* long\n" +
                "-65535 can be fitted in:\n" +
                "* int\n" +
                "* long\n" +
                "256 can be fitted in:\n" +
                "* short\n" +
                "* int\n" +
                "* long\n" +
                "255 can be fitted in:\n" +
                "* short\n" +
                "* int\n" +
                "* long\n" +
                "-256 can be fitted in:\n" +
                "* short\n" +
                "* int\n" +
                "* long\n" +
                "-255 can be fitted in:\n" +
                "* short\n" +
                "* int\n" +
                "* long\n" +
                "12222222222222222222222222222222222222222221 can't be fitted anywhere.", out.toString());
    }
}

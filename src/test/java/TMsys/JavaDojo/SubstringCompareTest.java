package TmSys.JavaDojo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static TmSys.JavaDojo.SubstringCompare.compare;

public class SubstringCompareTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;

    @BeforeEach
    public void setStreams(){
        System.setOut(new PrintStream(out));
    }

    @AfterEach
    public void restoreInitialStreams(){
        System.setOut(originalOut);
    }

    @Test
    public void out(){
        compare("welcometojava", 3);
        assertEquals(
                "ava\r\n" + "wel",
                out.toString());
    }
}

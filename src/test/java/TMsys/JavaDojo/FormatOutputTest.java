package TmSys.JavaDojo;

import org.junit.jupiter.api.Test;

import static TmSys.JavaDojo.FormatOutput.createLine;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormatOutputTest {

    @Test
    public void FormatOutput() {
        assertEquals("Java           035", createLine("Java", "35"));
    }

}

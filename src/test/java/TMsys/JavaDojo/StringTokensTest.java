package TmSys.JavaDojo;

import org.junit.jupiter.api.Test;

import static TmSys.JavaDojo.StringTokens.doTokens;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTokensTest {

    @Test
    public void main(){
        assertEquals("10\n" +
                "He\n" +
                "is\n" +
                "a\n" +
                "very\n" +
                "very\n" +
                "good\n" +
                "boy\n" +
                "isn\n" +
                "t\n" +
                "he", doTokens("He is a very very good boy, isn't he?"));
    }
}

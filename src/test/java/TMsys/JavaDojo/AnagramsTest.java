package TmSys.JavaDojo;

import org.junit.jupiter.api.Test;

import static TmSys.JavaDojo.Anagrams.check;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramsTest {

    @Test
    public void test(){
        assertEquals("Anagrams",check("anagram", "margana"));
        assertEquals("Not Anagrams",check("anagramy", "marganax"));
        assertEquals("Anagrams",check("helloword", "HelloWord"));
    }
}

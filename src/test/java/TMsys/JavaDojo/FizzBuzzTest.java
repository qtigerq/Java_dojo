package TiagoMelo.demo;

import org.junit.jupiter.api.Test;

import static TiagoMelo.demo.FizzBuzz.check;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void isNumber (){
        assertEquals("1", check(1));
        assertEquals("2", check(2));
    }

    @Test
    public void isFizz (){
        assertEquals("Fizz", check(3));
    }

    @Test
    public void isBuzz (){
        assertEquals("Buzz", check(5));
    }

    @Test
    public void isFizzBuzz (){
        assertEquals("FizzBuzz", check(15));
    }
}



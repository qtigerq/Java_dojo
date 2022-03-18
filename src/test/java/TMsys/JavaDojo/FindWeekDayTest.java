package TmSys.JavaDojo;

import org.junit.jupiter.api.Test;

import static TmSys.JavaDojo.FindWeekDay.findDay;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindWeekDayTest {

    @Test
    public void out() {
        assertEquals("WEDNESDAY", findDay(12, 21, 1994));
        assertEquals("FRIDAY", findDay(03, 18, 2022));
        assertEquals("SUNDAY", findDay(06, 13, 2049));
        assertEquals("TUESDAY", findDay(02, 17, 1925));
    }
}
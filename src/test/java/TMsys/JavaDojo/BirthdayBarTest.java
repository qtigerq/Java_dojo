package TmSys.JavaDojo;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static TmSys.JavaDojo.BirthdayBar.birthday;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BirthdayBarTest {

    @Test
    public void main(){
        List<Integer> chocBar = new ArrayList<>();
        chocBar.add(1);
        chocBar.add(2);
        chocBar.add(1);
        chocBar.add(3);
        chocBar.add(2);
        assertEquals(2, birthday(chocBar, 3, 2));
    }

    @Test
    public void main2(){
        List<Integer> chocBar = new ArrayList<>();
        chocBar.add(4);
        assertEquals(1, birthday(chocBar, 4, 1));
    }

    @Test
    public void main3(){
        List<Integer> chocBar = new ArrayList<>();
        chocBar.add(2);
        chocBar.add(5);
        chocBar.add(1);
        chocBar.add(3);
        chocBar.add(4);
        chocBar.add(4);
        chocBar.add(3);
        chocBar.add(5);
        chocBar.add(1);
        chocBar.add(1);
        chocBar.add(2);
        chocBar.add(1);
        chocBar.add(4);
        chocBar.add(1);
        chocBar.add(3);
        chocBar.add(3);
        chocBar.add(4);
        chocBar.add(2);
        chocBar.add(1);
        assertEquals(3, birthday(chocBar, 18, 7));
    }

    @Test
    public void main4(){
        List<Integer> chocBar = new ArrayList<>();
        chocBar.add(4);
        chocBar.add(5);
        chocBar.add(4);
        chocBar.add(2);
        chocBar.add(4);
        chocBar.add(5);
        chocBar.add(2);
        chocBar.add(3);
        chocBar.add(2);
        chocBar.add(1);
        chocBar.add(1);
        chocBar.add(5);
        chocBar.add(4);
        assertEquals(3, birthday(chocBar, 15, 4));
    }

}

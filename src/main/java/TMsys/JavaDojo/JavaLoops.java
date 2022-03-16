package TmSys.JavaDojo;

public class JavaLoops {

    public static void printMultiples(Integer n) {

        for (int i = 1; i <= 10 ; i++) {
            System.out.print(n + " x " + i + " = " + n*i);
            if (i!=10) System.out.print("\r\n");
        }

    }

}
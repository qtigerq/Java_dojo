package TmSys.JavaDojo;

public class JavaIfElse {

    public static String check(int number) {

        if ((number % 2 == 1) || (number > 5 && number < 21 )) {
            return "Weird";
        } else {
            return "Not Weird";
        }
    }
}

package TmSys.JavaDojo;

class UsernameValidator {
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}

public class RegexUser {

    public static String checkRegex(String namesString) {

        String[] namesArray = namesString.split("\n");
        String result = "";

        for (String name : namesArray){
            if (name.matches(UsernameValidator.regularExpression)) {
                result += "Valid" + "\n";
            } else {
                result += "Invalid" + "\n";
            }
        }

        return result.substring(0, result.length()-1);
    }
}
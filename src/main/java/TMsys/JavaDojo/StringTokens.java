package TmSys.JavaDojo;

import java.util.ArrayList;
import java.util.List;

public class StringTokens {

    public static String doTokens(String input){

        input = input.replace("!"," ");
        input = input.replace(","," ");
        input = input.replace("?"," ");
        input = input.replace("."," ");
        input = input.replace("_"," ");
        input = input.replace("'"," ");
        input = input.replace("@"," ");

        String[] tokens = input.split(" ");

        List<String> tokensList = new ArrayList<String>();

        for(String token : tokens) {
            if(token != null && token.length() > 0) {
                tokensList.add(token);
            }
        }

        String tokensPrint = "" + tokensList.size() + "\n";

        for (int round = 0; round < tokensList.size(); round++){
            tokensPrint += tokensList.get(round);
            if (round != tokensList.size()-1){
                tokensPrint += "\n";
            }
        }

        return tokensPrint;
    }

}

package TmSys.JavaDojo;

public class QueriesSum {

    public static void printQueriesLines(Integer[][] array) {

        int a = 0;
        int b = 0;
        int n = 0;
        int sum;
        int queries = array.length;

        for(int round = 0; round < queries; round++){

            a = array[round][0];
            b = array[round][1];
            n = array[round][2];
            sum = (a + b);
            System.out.print(sum);

            for (int querie = 1; querie < n; querie++){
                sum += (Math.pow(2, querie)) * b;
                System.out.print(" " + sum);
            }

            if (round != queries-1) { System.out.print("\r\n"); }
        }
    }
}
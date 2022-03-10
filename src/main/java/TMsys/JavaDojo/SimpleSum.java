package TiagoMelo.demo;

import java.util.List;

public class SimpleSum {

    public static Integer sum(List<Integer> lista) {
        Integer soma = 0;
        for ( Integer item: lista ) {
            soma += item;
        }
        return soma;
    }
}

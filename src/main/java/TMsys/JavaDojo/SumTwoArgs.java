package TiagoMelo.demo;

public class SumTwoArgs {
    public static Integer sum(String[] args) {
        int primeiroConvertido = Integer.parseInt(args[0]);
        int segundoConvertido = Integer.parseInt(args[1]);
        int soma = primeiroConvertido + segundoConvertido;
        return soma;
    }
}

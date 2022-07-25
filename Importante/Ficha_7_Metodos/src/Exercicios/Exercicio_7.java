package Exercicios;

public class Exercicio_7 {

    public static String ano_bisexto(int ano) {
        String res;
        if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
            res = "O seu ano é bissexto";
        } else {
            res = "O seu ano é comum.";
        }
        return res;
    }

    public static void main(String[] args) {

        String res = ano_bisexto(2000);
        System.out.println(res);
    }
}

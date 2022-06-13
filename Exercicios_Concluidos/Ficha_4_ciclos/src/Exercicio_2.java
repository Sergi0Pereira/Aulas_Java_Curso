
import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args) {
        int numero;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira o numero da tabuada que pretende: ");
        numero = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            int res = numero * i;
            System.out.println(numero + "x" + i + "=" + res);
        }

    }
}
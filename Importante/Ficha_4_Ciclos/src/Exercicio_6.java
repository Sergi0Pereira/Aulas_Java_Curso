
import java.util.Scanner;

public class Exercicio_6 {

    public static void main(String[] args) {

        double numero;

        Scanner in = new Scanner(System.in);
        System.out.println("Insira o numero que pretende verificar: ");
        numero = in.nextInt();

        for (double i = 2; numero >= i; i++) {
            if (numero % i == 0 && numero != i) {
                System.out.print("O seu numero nao é primo.");
                break;
            } else if (numero == i) {
                System.out.println("O seu numero é primo.");

            }

        }

    }

}

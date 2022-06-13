
import java.util.Scanner;

public class Exercicio_4 {

    public static void main(String[] args) {

        int numero;
        int soma = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Insira o numero que pretende inverter: ");
        numero = in.nextInt();

        for (; numero != 0; numero /= 10) {
            int resto = numero % 10;
            soma += resto;
        }

        System.out.println("A soma dos algarismos do seu numero é de: " + soma);
    }
}
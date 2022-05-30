
import java.util.Scanner;

public class Exercicio_9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String frase;
        char letra;
        int cont = 0;

        System.out.println("Insira uma frase: ");
        frase = in.nextLine();

        System.out.println("Qual o caracter que pretende contabilizar?");
        letra = in.next().charAt(0);

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                cont++;
            }
        }

        System.out.println("A sua letra está presente " + cont + " vezes.");

    }
}

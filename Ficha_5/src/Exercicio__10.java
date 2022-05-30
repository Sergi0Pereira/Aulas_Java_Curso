
import java.util.Scanner;

public class Exercicio__10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String frase;
        String replace;
        char sub, novo;

        System.out.println("Insira uma frase: ");
        frase = in.nextLine();

        System.out.println("Qual o caracter que pretende substituir.");
        sub = in.next().charAt(0);

        System.out.println("Qual o novo caracter?");
        novo = in.next().charAt(0);

        replace = frase.replace(sub, novo);

        System.out.println("Aqui está a sua nova frase:\n" + replace);

    }
}

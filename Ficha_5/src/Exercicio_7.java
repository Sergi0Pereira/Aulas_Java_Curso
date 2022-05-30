
import java.util.Scanner;

public class Exercicio_7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String p1, p2, p3;

        System.out.println("Insira uma frase: ");
        p1 = in.nextLine();

        System.out.println("Insira uma palavra: ");
        p2 = in.next();

        if (p1.trim().endsWith(p2)) // trim remove os espaços(antes e depois) do texto.
            System.out.println("Os ultimos caracteres sao iguais.");
        else {
            System.out.println("Os ultimos caracteres nao sao iguais.");
        }

    }
}
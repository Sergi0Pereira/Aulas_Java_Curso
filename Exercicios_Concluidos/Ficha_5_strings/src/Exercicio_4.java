
import java.util.Scanner;

public class Exercicio_4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String p1, p2;
        System.out.println("Insira a primeira palavra: ");
        p1 = in.next();

        System.out.println("Insira a segunda palavra: ");
        p2 = in.next();

        if (p1.equalsIgnoreCase(p2))
            System.out.println("As palavras sao iguais");
        else {
            System.out.println("As palavras nao sao iguais.");
        }
    }
}
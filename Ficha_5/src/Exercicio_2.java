
import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int posicao;
        String palavra;

        System.out.println("Insira uma palavra: ");
        palavra = in.next();

        System.out.println("Insira uma posiçao:");
        posicao = in.nextInt();

        System.out.println("O caracter no inidice " + posicao + " é o " + palavra.charAt(posicao) + ".");
    }
}
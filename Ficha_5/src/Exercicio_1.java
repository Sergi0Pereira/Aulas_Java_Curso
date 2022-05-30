
import java.util.Scanner;

public class Exercicio_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nome;
        System.out.println("Insira o seu nome: ");
        nome = in.next();

        System.out.println("O seu nome tem " + nome.length() + " letras.");
    }
}
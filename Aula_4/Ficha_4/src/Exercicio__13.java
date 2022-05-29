
import java.util.Scanner;

public class Exercicio__13 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double area = 0;
        String pergunta;
        int i = 1;

        System.out.println("Insira a area da " + i + " divisao: ");

        area += in.nextDouble();
        i++;

        System.out.println("Deseja inserir uma nova Divisao?");
        pergunta = in.next();

        while (pergunta.toLowerCase().equals("sim")) {
            System.out.println("Insira a area da " + i + " divisao: ");
            area += in.nextDouble();
            i++;
            System.out.println("Deseja inserir uma nova Divisao?");
            pergunta = in.next();

        }
        System.out.println("A area total da sua casa é de " + area + " metros quadrados.");
    }
}

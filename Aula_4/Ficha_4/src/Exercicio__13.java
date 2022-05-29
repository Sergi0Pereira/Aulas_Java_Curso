import java.util.Scanner;

public class Exercicio__13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double area = 0, comp, larg;
        String pergunta;
        int i = 1;

        do {
            System.out.println("Insira o comprimento da " + i + " divisao: ");
            comp = in.nextDouble();
            
            System.out.println("Insira o comprimento da " + i + " divisao: ");
            larg = in.nextDouble();
            
            area += comp * larg;
            i++;
            
            System.out.println("Deseja inserir uma nova Divisao?");
            pergunta = in.next();
            
                while(!pergunta.equals("sim") && !pergunta.equals("nao")){
                   System.out.println("Entrada Inválida. Insira uma resposta válida.");
                   pergunta = in.next();
                }
            } 
        while (pergunta.toLowerCase().equals("sim"));

        System.out.println("A area total da sua casa é de " + area + " metros quadrados.");
    }
}
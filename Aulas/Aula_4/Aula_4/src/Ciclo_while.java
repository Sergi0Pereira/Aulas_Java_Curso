import java.util.Scanner;

public class Ciclo_while {
    public static void main(String[] args) {
        // Escrever um método main que encontra a soma de números inseridos
        // pelo utilizador onde o número -99999 será o número que interrompa
        // essa soma, e apresenta-a.

        int n1, soma, ctd;

        Scanner read = new Scanner(System.in);
        n1 = 0;
        soma = 0;
        ctd = 0;
        System.out.println("Insira um número: ");
        n1 = read.nextInt();

        while (n1 != -99999) {
            soma = soma + n1;
            ctd = ctd + 1;
            System.out.println("Insira um número: ");
            n1 = read.nextInt();
        }

        if (ctd == 0) {
            System.out.println("Fim da aplicação. Não entrou no ciclo.");
        } else {
            System.out.println("A soma dos números é: " + soma);
        }

    }
}
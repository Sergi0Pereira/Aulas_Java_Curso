
import java.util.Scanner;

public class Exercicio__14 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int tam;

        System.out.println("Insira o valor da sua matriz: ");
        tam = in.nextInt();

        while (tam < 3) {
            System.out.println("Erro! Insira um valor maior ou igual a 3! ");
            tam = in.nextInt();
        }
        int x = 1;
        int y = 1;
        for (int i = 1; i <= tam; i++) {
            if (i == x || tam == x) {
                System.out.print("X");
            } else {
                System.out.print("O");
            }
        }
        x++;
        for (int i = 1; i <= tam; i++) {
            if (i == y || tam == y) {
                System.out.println("X");
            } else {
                System.out.println("O");
            }
        }
        y++;

    }
}

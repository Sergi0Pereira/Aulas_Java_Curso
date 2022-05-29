
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio__11 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String palavra;
        int reps = 0;
        char A;
        int x = 0;

        System.out.println("Insira aqui a sua palavra:");
        palavra = in.next();
        System.out.println("A descobrir a sua palavra........ ");
        System.out.print("A sua palavra é ");

        for (int i = 0; i <= 127; i++) {
            char a = (char) i;
            if (palavra.charAt(x) == a) {
                System.out.print(a);
                x++;
                i = 0;
                if (palavra.length() == x) {
                    break;
                }
            }
            reps++;
        }
        System.out.print(", e o numero de tentativas foram  " + reps + ".");
    }
}
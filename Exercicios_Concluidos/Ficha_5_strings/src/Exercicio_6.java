
import java.util.Scanner;

public class Exercicio_6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String p1, p2;
        int x = 1;
        System.out.println("Insira uma frase: ");
        p1 = in.nextLine();

        System.out.println("Insira uma palavra: ");
        p2 = in.next();

        if (p1.contains(p2) && p2.length() > x)
            System.out.println("A sua palavra está presente na frase.");
        else if (p1.contains(p2) && p2.length() == x) {
            System.out.println("A sua letra está presente na frase.");
        } else if (!p1.contains(p2) && p2.length() == x) {
            System.out.println("A sua letra nao está presente na frase.");
        } else {
            System.out.println("A sua palavra nao está presente na frase.");
        }
    }
}
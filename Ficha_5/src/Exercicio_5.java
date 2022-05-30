
import java.util.Scanner;

public class Exercicio_5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String p1, p2, p3;
        System.out.println("Insira a primeira palavra: ");
        p1 = in.next();

        System.out.println("Insira a segunda palavra: ");
        p2 = in.next();

        p3 = p1.concat(p2);

        System.out.println(p3);
    }
}

import java.util.Scanner;

public class Exercicio__10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double num, num2;
        num = in.nextInt();
        num2 = num - 1;

        for (int i = 0; num2 > i; i = 0) {
            num = num * num2;
            num2--;
        }
        System.out.println(num);
    }
}
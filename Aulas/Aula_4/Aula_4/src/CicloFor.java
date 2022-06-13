
import java.util.Scanner;

public class CicloFor {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
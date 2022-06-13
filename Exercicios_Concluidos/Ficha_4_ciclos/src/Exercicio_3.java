
import java.util.Scanner;

public class Exercicio_3 {

    public static void main(String[] args) {

        int numero;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira o numero que pretende inverter: ");
        numero = in.nextInt();

        /*
         * while( numero!=0){
         * numero--;
         * System.out.println(numero);
         * }
         */
        for (; numero != 0; numero /= 10) {
            int resto = numero % 10;
            System.out.print(resto + "");
        }

    }
}
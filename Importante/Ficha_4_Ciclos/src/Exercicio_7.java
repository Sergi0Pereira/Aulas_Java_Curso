import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio_7 {

    public static void main(String[] args) {

        int input = 0;
        int resto = 0;
        int inversao = 0;

        String numInver;
        String numero;

        ArrayList invertido = new ArrayList();

        numInver = (String) invertido.stream().map(Object::toString).collect(Collectors.joining(""));

        Scanner in = new Scanner(System.in);
        System.out.println("Insira o numero que pretende verificar: ");
        input = in.nextInt();

        numero = Integer.toString(input);

        for (int i = 0; input != 0; i++) {

            resto = input % 10;
            input /= 10;
            invertido.add(resto);
            numInver = (String) invertido.stream().map(Object::toString).collect(Collectors.joining(""));

        }
        
        if (numero.equals(numInver)) {
            System.out.println("O seu numero é capicua.");
        } else {
            System.out.println("O seu numero nao é capicua");
        }
    }
}
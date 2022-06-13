package ficha_6_arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o numero que pretende verificar: ");

        int input = in.nextInt();
        int vezes = 0;
        int numeros[] = {1, 2, 3, 1, 1, 6, 1, 2};
        ArrayList lista = new ArrayList();

        for (int i = 0; i < numeros.length; i++) {
            if (input == numeros[i]) {
                if (vezes > 0) {
                    vezes++;
                    lista.add(i);
                    System.out.print("O seu numero está presente " + vezes + " vezes" + " no arreio nas posicoes: " + lista + ".\n");

                } else {
                    vezes++;
                    lista.add(i);
                    System.out.print("O seu numero está presente " + vezes + " vez" + " no arreio na posicao: " + lista + ".\n");
                }
            }
        }
        if (vezes == 0) {
            System.out.print("O seu numero nao está presente no arreio.\n");
        }
    }
}

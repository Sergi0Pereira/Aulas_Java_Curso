package ficha_6_arrays;

import java.util.Scanner;

public class Exercicio_1 {

    public static void main(String[] args) {

        int numeros[] = {1, 2, 3, 4, 5};
        System.out.println("Aqui está o seu arreio: ");
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length - 1) {
                System.out.print(numeros[i] + ".");
            } else {
                System.out.print(numeros[i] + ", ");
            }
        }
    }
}

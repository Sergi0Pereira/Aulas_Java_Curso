package ficha_6_arrays;

import java.util.Scanner;

public class Exercicio_7 {

    public static void main(String[] args) {

        int[] numeros = {3, 2, 1, 4, 5};
        int i = numeros.length;

        while (i != 0) {
            System.out.println(numeros[i - 1]);
            i--;
        }
    }
}

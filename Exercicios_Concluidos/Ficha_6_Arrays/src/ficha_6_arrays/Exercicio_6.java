package ficha_6_arrays;

import java.util.Scanner;

public class Exercicio_6 {

    public static void main(String[] args) {

        int[] numeros = {3, 2, 1, 4, 5, 8, 9, 63};
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("O maior numero do arreio é: " + maior);
        System.out.println("O menor numero do arreio é: " + menor);
    }
}

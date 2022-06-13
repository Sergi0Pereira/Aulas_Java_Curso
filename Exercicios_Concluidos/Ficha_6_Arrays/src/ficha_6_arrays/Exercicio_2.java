package ficha_6_arrays;

import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args) {

        int numeros[] = {1, 1, 1, 1, 2};
        int soma = 0;
        System.out.println("Aqui está o seu arreio: ");
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
            if (i == numeros.length - 1) {
                System.out.print(numeros[i] + "\n" + "A soma do arreio é de: " + soma+"\n");
            } else {
                System.out.println(numeros[i]);
            }
        }
    }
}

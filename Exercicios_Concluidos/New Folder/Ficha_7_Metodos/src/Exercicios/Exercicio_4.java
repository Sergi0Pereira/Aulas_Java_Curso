package Exercicios;

import java.util.Scanner;

public class Exercicio_4 {

    static void vogais() {
        Scanner in = new Scanner(System.in);

        String palavra;
        System.out.println("Insira aqui a sua palavra: ");
        palavra = in.next();
        int num = 0;
        char vogais[] = { 'a', 'e', 'i', 'o', 'u' };

        for (int i = 0; palavra.length() - 1 >= i; i++) {
            for (int x = 0; vogais.length > x; x++) {
                if (palavra.charAt(i) == vogais[x]) {
                    num++;

                }
            }
        }

        System.out.println("A sua palavra tem " + num + " vogais.");
    }

    public static void main(String[] args) {
        vogais();
    }
}

package Exercicios;

import java.util.Scanner;

public class Exercicio_5 {

    static void contagem_palavras_caracteres() {

        Scanner in = new Scanner(System.in);

        String texto;
        int palavras = 0;

        System.out.println("Insira aqui o seu texto: ");
        texto = in.nextLine();

        for (int i = 0; i < texto.length() - 1; i++) {

            if (texto.charAt(i) != ' ' && texto.charAt(i + 1) == ' ') {
                palavras++;
            } else if ((texto.charAt(i) != ' ' && texto.charAt(i + 1) != ' ') && i ==0) {
                palavras++;
            }
        }
        texto = texto.replaceAll("\\s", "");

        System.out.println("O numero de palavras presentes no texto é de: " + palavras);
        System.out.println("O numero de caracteres presentes no texto é de: " + texto.trim().length());

    }

    public static void main(String[] args) {
        contagem_palavras_caracteres();

    }

}

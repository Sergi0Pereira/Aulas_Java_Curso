package Exercicios;

import java.util.Scanner;

public class Exercicio_2 {

    static void media_3_nums() {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira aqui o seu primeiro numero: ");
        double x = in.nextDouble();

        System.out.println("Insira aqui o seu segundo numero: ");
        double y = in.nextDouble();

        System.out.println("Insira aqui o seu terceiro numero: ");
        double z = in.nextDouble();

        double media = (x + y + z) / 3;
        System.out.println("A sua media e de: " + media);

    }

    public static void main(String[] args) {
        media_3_nums();
    }
}

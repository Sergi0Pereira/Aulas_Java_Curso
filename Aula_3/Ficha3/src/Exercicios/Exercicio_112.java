package Exercicios;

import java.util.Scanner;

public class Exercicio_112 {

    public static void main(String[] args) {

        double ano;
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o ano que pretende avaliar: ");
        ano = in.nextDouble();
        if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
            System.out.println("O seu ano é bissexto");
        } else {
            System.out.println("O seu ano é comum.");
        }
    }
}

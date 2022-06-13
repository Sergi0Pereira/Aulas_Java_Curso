package Exercicios;

import java.util.Scanner;

public class Exercicio_3 {

    static void caracter_central() {
        String cater;
        Scanner in = new Scanner(System.in);
        cater = in.next();
        int x = cater.length() / 2;
        if (cater.length() % 2 == 0) {
            System.out.print(cater.charAt(x - 1));
            System.out.print(cater.charAt(x));
        } else {
            System.out.print(cater.charAt(x));

        }

    }

    public static void main(String[] args) {
        caracter_central();
    }
}

package Exercicios;

import java.util.Scanner;

public class Exercicio_109 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double x, y, z;

        System.out.println("Insira aqui o primeiro numero : ");
        x = in.nextDouble();

        System.out.println("Insira aqui o segundo numero : ");
        y = in.nextDouble();

        System.out.println("Insira aqui o terceiro numero : ");
        z = in.nextDouble();

        if (x > y && x > z && z < y) {
            System.out.println("A ordem ascendente é de: " + z + " " + y + " " + x);
        }

        else if (x > y && x > z && z > y) {
            System.out.println("A ordem ascendente é de: " + y + " " + z + " " + x);
        }

        else if (y > x && y > z && x > z) {
            System.out.println("A ordem ascendente é de: " + z + " " + x + " " + y);
        }

        else if (y > x && y > z && x < z) {
            System.out.println("A ordem ascendente é de: " + x + " " + z + " " + y);
        }

        else if (z > x && z > y && x > y) {
            System.out.println("A ordem ascendente é de: " + y + " " + x + " " + z);
        }

        else if (z > x && z > y && x < y) {
            System.out.println("A ordem ascendente é de: " + x + " " + y + " " + z);
        }

        else if (x == y && z > x) {
            System.out.println(
                    "O Primeiro e Segundo numeros sao iguais, no entanto o Terceiro " + z + " é maior que eles.");
        }

        else if (x == y && z < x) {
            System.out.println(
                    "O Primeiro e Segundo numeros sao iguais, no entanto o Terceiro: " + z + " é menor que eles.");
        }

        else if (x == z && y > x) {
            System.out.println(
                    "O Primeiro e Terceiro numeros sao iguais, no entanto o Segundo: " + y + " é maior que eles.");
        }

        else if (x == z && y < x) {
            System.out.println(
                    "O Primeiro e Terceiro numeros sao iguais, no entanto o Segundo: " + y + " é menor que eles.");
        }

        else if (y == z && x > y) {
            System.out.println(
                    "O Segundo e Terceiro numeros sao iguais, no entanto o Primeiro: " + x + " é maior que eles.");
        }

        else if (y == z && y > x) {
            System.out.println(
                    "O Segundo e Terceiro numeros sao iguais, no entanto o Primeiro: " + x + " é menor que eles.");
        } else {
            System.out.println("Os numeros sao todos iguais!");
        }

    }
}
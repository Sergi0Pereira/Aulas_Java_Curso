/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class Exercicio_103 {

    public static void main(String args[]) {
        double x, y, z;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira os seus tres numeros: ");
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();

        if (x > y && x > z) {
            System.out.println("O maior número é o primeiro: " + x);
        } else if (y > x && y > z) {
            System.out.println("O maior número é o segundo: " + y);
        } else if (x == y && x == z) {
            System.out.println("Os seus numeros sao iguais");
        } else {
            System.out.println("O maior número é o terceiro: " + z);
        }

    }

}

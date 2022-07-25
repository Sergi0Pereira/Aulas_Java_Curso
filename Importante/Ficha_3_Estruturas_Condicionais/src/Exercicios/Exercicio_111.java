package Exercicios;

import java.util.Scanner;

public class Exercicio_111 {

    public static void main(String[] args) {

        String aluno = "";
        double notateste1 = 0, notateste2 = 0, notatrabalho1 = 0, notatrabalho2 = 0,

                notatrabalhofinal = 0, peso1 = 0.65, peso2 = 0.15, peso3 = 0.2, notafinal = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Insira o nome do aluno: ");
        aluno = in.next();

        System.out.println("Insira a nota do primeiro teste: ");
        notateste1 = in.nextDouble();
        while (notateste1 < 0 || notateste1 > 20) {
            System.out.println("Nota inválida");
            System.out.println("Insira a nota do primeiro teste: ");
            notateste1 = in.nextDouble();
        }

        System.out.println("Insira a nota do segundo teste: ");
        notateste2 = in.nextDouble();
        while (notateste2 < 0 || notateste2 > 20) {
            System.out.println("Nota inválida");
            System.out.println("Insira a nota do segundo teste: ");
            notateste2 = in.nextDouble();
        }

        System.out.println("Insira a nota do primeiro trabalho: ");
        notatrabalho1 = in.nextDouble();
        while (notatrabalho1 < 0 || notatrabalho1 > 20) {
            System.out.println("Nota inválida");
            System.out.println("Insira a nota do primeiro trabalho: ");
            notatrabalho1 = in.nextDouble();
        }

        System.out.println("Insira a nota do segundo trabalho: ");
        notatrabalho2 = in.nextDouble();
        while (notatrabalho2 < 0 || notatrabalho2 > 20) {
            System.out.println("Nota inválida");
            System.out.println("Insira a nota do segundo trabalho: ");
            notatrabalho2 = in.nextDouble();
        }

        System.out.println("Insira a nota do trabalho final: ");
        notatrabalhofinal = in.nextDouble();
        while (notatrabalhofinal < 0 || notatrabalhofinal > 20) {
            System.out.println("Nota inválida");
            System.out.println("Insira a nota do trabalho final: ");
            notatrabalhofinal = in.nextDouble();
        }

        notafinal = (peso1 * (notateste1 + notateste2)) / 2 +
                (peso2 * (notatrabalho1 + notatrabalho2)) / 2 + (peso3 * notatrabalhofinal);

        if (notafinal >= 9.5) {
            System.out.println("O aluno " + aluno + " obterve uma nota final de: " + notafinal + " e foi aprovado");
        } else {
            System.out.println("O aluno " + aluno + " obterve uma nota final de: " + notafinal + " e foi reprovado");
        }
    }
}

package Exercicios;

import java.util.Scanner;

public class Exercicio_108 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double x, y;

        System.out.println("Insira o valor de x: ");
        x = in.nextDouble();
        System.out.println("Insira o valor de y: ");
        y = in.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("As suas coordenadas estao localizadas na origem.");
        } else if (x > 0 && y == 0) {
            System.out.println("As suas coordenadas estao localizadas no eixo do X.");
        } else if (x == 0 && y > 0) {
            System.out.println("As suas coordenadas estao localizadas no eixo do Y.");
        } else if (x > 0 && y > 0) {
            System.out.println("As suas coordenadas estao localizadas no primeiro quadrante.");
        } else if (x < 0 && y > 0) {
            System.out.println("As suas coordenadas estao localizadas no segundo quadrante.");
        } else if (x < 0 && y < 0) {
            System.out.println("As suas coordenadas estao localizadas no terceiro quadrante.");
        } else
            System.out.println("As suas coordenadas estao localizadas no quarto quadrante.");
    }
}

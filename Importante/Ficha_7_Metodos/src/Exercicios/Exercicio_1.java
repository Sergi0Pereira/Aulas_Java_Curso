package Exercicios;

public class Exercicio_1 {

   public static void soma_3_nums(double x, double y, double z) {

        if (x <= y && x <= z) {
            System.out.println("O numero menor é: = " + x);
        } else if (y <= x && y <= z) {
            System.out.println("O numero menor é:  " + y);
        } else {
            System.out.println("O numero menor é:  " + z);
        }

    }

    public static void main(String[] args) {
        soma_3_nums(7, 6, 5);
    }
}

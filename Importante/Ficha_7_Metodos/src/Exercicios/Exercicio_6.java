package Exercicios;
// 6. Escreva um programa que tenha um método que devolve o somatório dos dígitos de um
// número inserido pelo utilizador.

public class Exercicio_6 {

    public static int soma_nums(int x) {
        int n = 0;
        for (int i = 0; i <= x; i++) {
            n += x % 10;
            x /= 10;
        }
        return n;
    }

    public static void main(String[] args) {

        int x = soma_nums(1289);
        System.out.println(x);

    }
}

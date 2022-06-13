package ficha_6_arrays;

public class Exercicio_8 {

    public static void main(String[] args) {

        int[] numeros = {3, 2, 1, 4, 5};
        int[] copia = {10, 20, 30, 40, 50};
        int i = numeros.length;
        int x = 0;
        while (i != 0) {
            copia[x] = numeros[i - 1];
            System.out.println(copia[x]);
            x++;
            i--;
        }

    }
}

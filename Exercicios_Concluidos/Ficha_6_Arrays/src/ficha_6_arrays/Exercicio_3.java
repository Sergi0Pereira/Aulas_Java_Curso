package ficha_6_arrays;

public class Exercicio_3 {

    public static void main(String[] args) {

        double numeros[] = {5, 6, 12, 1, 10};
        double soma = 0;
        double media = 0;
        System.out.println("Aqui está o seu arreio: ");
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
            if (i == numeros.length - 1) {
                System.out.print(numeros[i] + "\n" + "A soma do arreio é de: " + soma + "\n");
                media = soma / numeros.length;
            } else {
                System.out.println(numeros[i]);
            }
        }
        System.out.println("A media do seu arreio é de: " + (media));
    }
}

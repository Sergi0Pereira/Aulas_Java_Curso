package ficha_6_arrays;

import java.util.Scanner;

public class Exercicio_5{
    
    public static void main(String [] args){
    
    Scanner in= new Scanner(System.in);
    
        int[] numeros = {1, 2, 3, 4, 5};
        int[] numeros2 = {5, 4, 3, 2, 1};

        for (int i = 0; i < numeros.length; i++) {
            numeros2[i] = numeros[i];
            System.out.println(numeros2[i]);
        }
        
    }
}
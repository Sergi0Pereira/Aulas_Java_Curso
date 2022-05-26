
import java.util.Scanner;

import java.util.ArrayList;

public class Arrays {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] nomes = { "Sergio", "Pedro", null };

        int[] teste = { 1, 2, 3 };

        System.out.println("O tamanho do arreio nomes é de: " + nomes.length);

        ArrayList minhaLista = new ArrayList(); // ArraList é um metodo que permite criar um arreio dinamico com

        minhaLista.add("Antonio");
        minhaLista.add("José");
        minhaLista.add("Manuel");

        System.out.println(minhaLista);
        int i = 0;

        minhaLista.add(8, "Carlos");

        System.out.println(minhaLista);

        System.out.println(minhaLista.size());
        minhaLista.remove(minhaLista.size() - 1);

        System.out.println(minhaLista);

    }
}

/*
 * Colocar valores num array:Definimos a posição e atribuímos o valor.
 * Exemplo:Int[]arr1 = new int[9];Arr1[6] = 4;
 * Para guardar um valor que não seja primitivo: camisolas[] arrc = new
 * camisolas[3];
 * arrc[2] = new camisolas();
 * As strings são uma excepção ao mencionado no exemplo das camisolas,
 * no sentido em que possibilitam ser guardadas de múltiplas formas:Exemplo:
 * String [] arrs = new String[15];Arrs[5] = “Texto”;Arrs[10]= new
 * String(“Olá”);
 * 
 * O Java possui dois tipos de dados que são divididos em por valor (tipos
 * primitivos) e por referência (tipos por referência). Os tipos primitivos são
 * boolean, byte, char, short, int, long, float e double. Os tipos por
 * referência, são classes que especificam os tipos de objeto Strings, Arrays
 * Primitivos e Objetos.
 */
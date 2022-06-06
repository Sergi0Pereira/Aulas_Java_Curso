

import java.util.HashSet;
import java.util.Set;

public class Exercicio_9 {

    public static void main(String[] args) {

        int[] lista1 = {1, 2, 3, 4, 6, 7, 8};
        int[] lista2 = {1, 6, 3, 7, 3, 3, 9};
        Set<Integer> reps = new HashSet<>();
        
        for (int i = 0; i < lista1.length; i++) {
            for (int y = 0; y < lista2.length; y++) {
                if (lista1[i] == (lista2[y])) {
                    reps.add(lista1[i]);
                }
            }
        }
         System.out.println(reps);
    }
}

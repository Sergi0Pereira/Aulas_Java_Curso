package ficha_6_arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_9_ArrayList {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String res = "s";
        int num;
        ArrayList numeros = new ArrayList();
        Set<Integer> reps = new HashSet<>();

        while (!res.equalsIgnoreCase("n") && res.equalsIgnoreCase("s")) {
            System.out.println("Insira os seus numeros: ");
            num = in.nextInt();
            numeros.add(num);
            System.out.println("Deseja inserir mais algum numero?"); 
            res = in.next();
        }

        int x = numeros.size() - 1;
        for (int i = 0; i < x; i++) {
            for (x = x; i < x; x--) {
                if (numeros.get(i) == numeros.get(x)) {
                    if (!reps.equals(numeros.get(x))) {
                        reps.add((Integer) numeros.get(i));
                    }
                }
            }
            x = numeros.size() - 1;
        }
        System.out.println("Os numeros repetidos sao: " + reps);
    }
}

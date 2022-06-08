package ficha_6_arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercicio__11 {

    public static void main(String[] args) {

        String[] nomes = {"Sergio", "Junior", "Elisandra"};
        String[] nomes1 = {"Gosta", "Detesta", "Ama"};
        String[] nomes2 = {"Comida", "Futebol", "Música"};

        List<String> StringList = Arrays.asList(nomes);
        List<String> StringList1 = Arrays.asList(nomes1);
        List<String> StringList2 = Arrays.asList(nomes2);

        Collections.shuffle(StringList );
        Collections.shuffle(StringList1 );
        Collections.shuffle(StringList2 );

        System.out.println(nomes[0]+" "+nomes1[1]+" "+nomes2[0]);
    }
}

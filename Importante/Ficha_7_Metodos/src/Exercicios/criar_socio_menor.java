package Exercicios;

import java.util.Scanner;
import java.util.ArrayList;

public class criar_socio_menor {



    public static final 
   ArrayList<Integer> socio_menor_id = new ArrayList<Integer>();

    ArrayList<String> socio_menor = new ArrayList<String>();
    


    public static void socio_nomes() {

        ArrayList<Integer> socio_menor_id = new ArrayList<Integer>();

        ArrayList<String> socio_menor = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        Integer id = 1;
        for (int i = 0; socio_menor.size() >= i; i++) {
            System.out.println("Insira o nome do novo socio menor: ");
            socio_menor.add(in.next());
            socio_menor_id.add(id);
            i++;
        }
                id++;
}
        public static void main(String[] args) {
        socio_nomes();
        System.out.println(socio_menor);
        System.out.println(socio_menor_id);
        

    
        /* String nome= new String();
        Scanner in= new Scanner(System.in);
        nome=in.next();
        Integer idade=in.nextInt();
        idade.toString();
         */
    }




    }


    


import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_7 {

    public static void main(String[] args) {

        int numero=0;
        int numSaved=0;
        int resto=0;
        int inversao=0;

        Scanner in = new Scanner(System.in);
        System.out.println("Insira o numero que pretende verificar: ");
        numero = in.nextInt();
        numSaved=numero;

        for (int i=0; numero != 0;i++ ) {
            numero /= 10;
             resto += numero % 10;
             ArrayList invertido= new ArrayList();
             invertido.add(resto);
              System.out.println(invertido.get(i));
                    }
        

    }
}

/*
            
            
            
            
            
         for(int x=0; i>x;x++){
             inversao=inversao+invertido[x];
         }

        if(resto==numSaved){
            System.out.println("O seu numero é capacua.");
        }
        else{
            System.out.println("O seu numero nao é capicua.");
        }

    }
*/
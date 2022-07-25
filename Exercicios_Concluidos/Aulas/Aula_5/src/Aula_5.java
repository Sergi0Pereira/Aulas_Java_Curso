
import java.util.ArrayList;
import java.util.Scanner;

public class Aula_5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int comp, alt;
        char sim;
        
        String[] nomes={"sergio","miguel","Sousas"};
        
        for(int i=0; i<nomes.length;i++){
            System.out.println(nomes[i]);
        }
        System.out.println("Insira por favor o comprimento da sua figura");
        comp = in.nextInt();

        System.out.println("Insira por favor a altura da sua figura");
        alt = in.nextInt();

        System.out.println("Insira o simbolo que pretende");
        sim = in.next().charAt(0);

        for (int x = 0; x < alt; x++) {
            for (int i = 0; i < comp; i++) {
                System.out.print(sim);
            }
                System.out.println("");
        }
 
        }
    }



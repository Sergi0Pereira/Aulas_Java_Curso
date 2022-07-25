package Consultar;

import static Inserir.insercaoClube.clubes;
import java.util.Scanner;

public class consultaClube{
    
    public static void consultaClube() {

        for (Object clube : clubes) {
            if (clubes.get(0) == clube) {
                System.out.println("Id do Clube: " + clube);
            }
            if (clubes.get(1) == clube) {
                System.out.println("Nome do Clube: " + clube);
            }
            if (clubes.get(2) == clube) {
                System.out.println("NIF do Clube: " + clube);
            }
            if (clubes.get(3) == clube) {
                System.out.println("Capital Social do Clube: " + clube);
            }
            if (clubes.get(4) == clube) {
                System.out.println("Preço por Aula do Clube: " + clube);
            }
        }
    }
    
    public static void main(String [] args){
    
    Scanner in= new Scanner(System.in);
    }
}
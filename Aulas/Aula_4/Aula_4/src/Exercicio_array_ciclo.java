
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_array_ciclo{
    
    public static void main(String [] args){
    
    Scanner in= new Scanner(System.in);
    
    ArrayList inserir = new ArrayList();
    String res="";
    int i=0;
        do{
        System.out.println("Insira aqui a sua palavra: ");
        inserir.add(i,in.next());
         System.out.println("Deseja inserir mais uma palavra?");
         i++;
         res=in.next();
        } while("sim".equals(res));
        
        System.out.println("Aqui estao as suas palavras guardadas:");
        
        System.out.println(inserir);
    }
  
        }           

  
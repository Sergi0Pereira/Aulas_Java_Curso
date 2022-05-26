
import java.util.Scanner;

public class Ciclos{
    
    public static void main(String [] args){
        
    // while ----  do/while ---- for
    
    Scanner in= new Scanner(System.in);
    
    double comp=0, larg=0,metros=0;
    int div=0;
    String resp;
    do{
        System.out.println("Insira por favor o comprimento da Divisao: ");
        comp= in.nextDouble();
        System.out.println("Insira por favor a largura da Divisao: ");
        larg= in.nextDouble();
        metros+=(comp*larg);
        div++;
        System.out.println("Deseja Inserir mais Divisoes? Sim/Nao");
        resp=in.next().toLowerCase();
    }
    while ( "sim".equals(resp));
  
    System.out.println("Inseriu "+ div + " divisoes e necessita de " + metros + " quadrados." );
    
    }
    
    
    
   
    }
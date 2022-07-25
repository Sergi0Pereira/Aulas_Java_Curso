import java.util.Scanner;

public class Exercicio_9{
    
    public static void main(String [] args){
        
        Scanner in= new Scanner(System.in);
        
    int quantidade,soma=0,impares;
    
        System.out.println("Insira a quantidade de numeros impares que pretende somar:");
        quantidade= in.nextInt();
        System.out.println("Os seus numeros impares sao: ");
        
        for(int i=1; i<=quantidade;i++){
            if(i%2!=0){
                soma+=i;
                System.out.print(i+"  ");  
            }
        }
        System.out.println("");
        System.out.println("A soma dos numeros é de "+soma+".");
    
    }
}
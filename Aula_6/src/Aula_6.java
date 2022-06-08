
import java.util.Scanner;

public class Aula_6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int tam;
        System.out.println("Insira o tamanho do seu arreio: ");
        tam = in.nextInt();
        String[] nomes = new String[tam];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Insira o seu " + (i + 1) + " nome");
            nomes[i] = in.next();
        }

        for (int i = 0; i < nomes.length-1; i++) {
            System.out.println("Este é o seu " + (i+1) + " nome: " + nomes[i]);
        }
        
        for(String nome : nomes){
            System.out.println("Este é o seu  nome: " + nome);
            
            int num=1;
            
            int num2= ++num;
            System.out.println(num2); //2
            
            int num3= num2++;//3
            System.out.println(num3);//2
            
            mensagem();
            
           soma(12,15,"Sergio");
            
        }
    }
    
    public static void mensagem(){
        
        System.out.println("Ola!");
    }

    public static void soma(int x,int y,String nome){
    
       int res=x+y;
        System.out.println("O seu nome é " + nome + " e a soma dos seus numeros é de : "+res);
    }
    
}


import java.util.Scanner;

public class Exercicio_8{
    
    public static void main(String [] args){
    
        int num,bases,numbase;
    Scanner in= new Scanner(System.in);
        System.out.println("Insira um numero: ");
    num=in.nextInt();
    System.out.println("Insira o numero de bases que pretende: ");
    bases=in.nextInt();
    
    for(int i = 1; i<=bases;i++){
        numbase=num*num;
        num++;
       // System.out.println("O quadrado da " + i +" base do seu numero é de " + numbase + ".");
        System.out.println( num + "^2 = " + numbase);
}

    }
}

/*
public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Introduza o número de bases: ");
        int base = in.nextInt();
        
        for(int i = 1; i <= base; i++){
            System.out.println( i + "^2 = " + Math.pow(i, 2));
        }
    }
}

*/
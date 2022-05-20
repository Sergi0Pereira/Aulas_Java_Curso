package Exercicios;

import java.util.Scanner;

public class Exercicio_105{
    
    public static void main(String [] args){
    
    Scanner in= new Scanner(System.in);
    
    int x;
        System.out.println("Insira aqui o seu numero:");
        
    x=in.nextInt();
    
        if(x%2==0){
            System.out.println("O seu numero é par.");
        }
        else{
            System.out.println("O seu numero é impar");
        }
    }
}
package Exercicios;

import java.util.Scanner;

public class Exercicio_104{
    
    public static void main(String [] args){
    
    Scanner in= new Scanner(System.in);
    
    double x,y;
    System.out.println("Insira dois números: ");
    x=in.nextDouble();
    y=in.nextDouble();
    if(x%y==0){
        System.out.println("O primeiro número é multiplo do segundo.");
    }
    else{
        System.out.println("O primeiro número nao é multiplo do segundo.");
           }
    }
}

package javaapplication6;

import java.util.Scanner;

public class Exercicio_106{
    
    public static void main(String [] args){
    Scanner in= new Scanner(System.in);
        double altura;
    
    System.out.println("Insira a sua altura em metros: ");
    altura=in.nextDouble();
        if(altura<1.3){
            System.out.println("Baixissima");
        }
        else if (altura>=1.3 && altura<=1.6){
            System.out.println("Baixa");
        }
    
        else if (altura>1.6 && altura<=1.75){
            System.out.println("Mediana");
        }
    
        else if (altura>1.75 && altura<=1.9){
            System.out.println("Alta");
        }
    
        else {           
            System.out.println("Altissima");
        }
    
    }
}
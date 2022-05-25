package Exercicios;

import java.util.Scanner;

public class Exercicio_113{
    
    public static void main(String [] args){
    double a,b,c,discriminante,raiz1,raiz2;
    Scanner in= new Scanner(System.in);
        
    System.out.println("Insira o valor de a: ");
    a=in.nextDouble();
    
    System.out.println("Insira o valor de b: ");
    b=in.nextDouble();
    
    System.out.println("Insira o valor de c: ");
    c=in.nextDouble();
    
    
    discriminante= Math.pow(b,2) - (4*a*c);
    
    if(discriminante>0){
        System.out.println("As raízes são reais e diferentes.");
    }
    else if(discriminante==0){
        System.out.println("As raízes são reais e iguais.");
    }
    else{
        System.out.println("As raízes são complexas e diferentes.");
    }
    
    if(discriminante>0){
        raiz1= (-b+Math.sqrt(discriminante));
        raiz1/=2*a;
        raiz2= (-b-Math.sqrt(discriminante));
        raiz2/=2*a;
        System.out.println("O valor das duas raizes sao de: {"+raiz1+", "+raiz2+"}.");
    }
    else if(discriminante==0){
        raiz1=raiz2= -b/(2*a);
        System.out.println("O valor das duas raizes iguais e tem o valor de: {"+raiz1+"}.");
    }
    else{
        System.out.println("A equação de 2º grau não possui raízes reais!");
    }

    }
    
    }

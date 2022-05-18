package javaapplication6;

import java.util.Scanner;

public class Exercicio_107{
    
    public static void main(String [] args){
    
    Scanner in= new Scanner(System.in);
    
    double x,y,res;
    String operador = null;
    
        System.out.println("Insira o primeiro número: ");
        x=in.nextDouble();
        System.out.println("Insira o operador: ");
        operador=in.next();
        System.out.println("Insira o segundo número: ");
        y=in.nextDouble();
    
        switch(operador){
            case "+" :
                res=x+y;
                System.out.println("Resultado: "+ res);
                break;
            case "-" :
                res=x-y;
                System.out.println("Resultado: "+ res);
                break;
            case "*" :
                res=x*y;
                System.out.println("Resultado: "+ res);
                break;
            case "/" :
                res=x/y;
                System.out.println("Resultado: "+ res);
                break;
            default:
                System.out.println("Operador Inválido ");
        }
        
    }
}
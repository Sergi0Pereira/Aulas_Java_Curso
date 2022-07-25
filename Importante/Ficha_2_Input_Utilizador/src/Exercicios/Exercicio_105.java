/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class Exercicio_105 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Double x,y,soma,subtracao,multiplicacao, divisao,restodivisao;
        
            System.out.println("Insira por favor o primeiro numero:");
            x=in.nextDouble();
            
            System.out.println("Insira por favor o segundo numero:");
            y=in.nextDouble();
            
            soma=x+y;
            subtracao=x-y;
            multiplicacao=x*y;
            divisao=x/y;
            restodivisao=x%y;
            
            System.out.println("O resultado da sua soma é de:" + soma);
            System.out.println("O resultado da sua subtracao é de:" + subtracao);
            System.out.println("O resultado da sua multiplicacao é de:" + multiplicacao);
            System.out.println("O resultado da sua divisao é de:" + divisao);
            System.out.println("O resultado do seu restodivisao é de:" + restodivisao);
            
            
    }
    
}
    


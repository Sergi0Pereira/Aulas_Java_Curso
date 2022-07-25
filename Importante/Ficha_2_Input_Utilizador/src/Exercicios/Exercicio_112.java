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
public class Exercicio_112 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1,num2;
    
        System.out.println("Insira o seu primeiro numero: ");
    
         num1= in.nextDouble();
    
         System.out.println("Insira o seu segundo numero: ");

         num2= in.nextDouble();
    
        double soma=num1+num2;
        double sub=num1-num2;
        double mult=num1*num2;
        double div=num1/num2;
        double media=(num1+num2)/2;
    
    
        System.out.println("Soma = " + soma+ "\n" + "Subtracçao = " + sub +"\n" + "Multiplicacao = " + mult+ "\n" + "Divisao = "  + div + "\n" + "Media = " + media + "\n"  );
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class Exercicio_102 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        double  x;
        System.out.println("Insira por favor o numero: ");
        x=in.nextDouble();

        
        if(x>0){
            System.out.println("Os numero é positivo.");
        }
        else if(x<0){
            System.out.println("Os numero é negativo.");
        }
        else{
            System.out.println("Os numeros é zero.");
        }
    }
}

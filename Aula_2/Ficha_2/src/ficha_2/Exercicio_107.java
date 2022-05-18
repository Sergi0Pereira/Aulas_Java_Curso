/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha_2;

import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class Exercicio_107 {
    
    public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    Double num,soma=0.0;
    int y=1;
    while (y <= 5){
            System.out.println("Insira o " + y + " numero: ");
            num=in.nextDouble();
            soma=soma+num;
            y++;
                   }   
   Double media=soma/(y-1);
   System.out.println("A soma dos numeros é de:" +soma + ", e a media é de: " + media + ".");
   
         }   
 }

    


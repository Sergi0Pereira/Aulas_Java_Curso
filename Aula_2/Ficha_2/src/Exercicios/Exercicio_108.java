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
public class Exercicio_108 {
    public static void main(String[] args) {
   Scanner in= new Scanner(System.in);
   double comprimento;
   double largura;
   
   System.out.println("Insira a comprimento: ");
   comprimento = in.nextDouble();
   
     System.out.println("Insira a largura: ");
   largura = in.nextDouble();
   
   double area= comprimento*largura;
   double perimetro= (comprimento*2) + (largura*2);
   
   System.out.println("O seu perimetro é de: " + perimetro + ".\n" + "A sua area é de: " + area + ".");
    }
    
}

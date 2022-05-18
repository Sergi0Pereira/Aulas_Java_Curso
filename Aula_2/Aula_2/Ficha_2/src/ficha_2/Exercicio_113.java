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
public class Exercicio_113 {
    
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);
        
        double num=1.32;
        
        System.out.println("Insira um numero por favor: ");
        num=in.nextDouble();
        
       
       int valor = (int)num;
        
       while(valor%2!=0){
           valor++;
        }
       System.out.println(valor);
       
       valor=(int)num;
       while(valor%2!=0){
           valor--;
        }
       System.out.println(valor);
       
       
   
       
    }
    
}

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
        
        double num;
        
        System.out.println("Insira um numero por favor: ");
        num=in.nextDouble();

        int arr = (int) ((int)num+0.5);
        System.out.println(arr);
       
       int valor = (int)num;



       if(valor%2==0){
         valor++;
       }
       while(valor%2!=0){
           valor++;
        }
       System.out.println(valor);
       
       valor=(int)num;
      if(valor%2!=0){
        valor--;
      }
       while(valor%2!=0){
           valor--;
        }
       System.out.println(valor);
       
       
   
       
    }
    
}

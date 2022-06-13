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
public class Exercicio_111 {
    
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        double anos,dias,minutos;
        
        System.out.println("Insira por favor o número de minutos que deseja converter: ");
        minutos= in.nextDouble();
        
        dias=(minutos/60)/24;
        anos=dias/365;
        
        System.out.println("Dias: "+  dias);
        System.out.println("Anos: "+anos);
        
        
    }
    
}

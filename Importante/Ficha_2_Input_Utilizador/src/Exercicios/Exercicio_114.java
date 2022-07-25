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
public class Exercicio_114 {
  public static void main(String[] args) {

    Scanner in= new Scanner(System.in);
    double anos,dias,horas,minutos,segundos;

    System.out.println("Insira por favor o número de segundos que deseja converter: ");
    segundos= in.nextDouble();

    minutos=segundos/60;
    horas=minutos/60;
    dias=(minutos/60)/24;
    anos=dias/365;

    System.out.println("minutos: "+minutos);
    System.out.println("horas: "+horas);
    System.out.println("Dias: "+  dias);
    System.out.println("Anos: "+anos);




  }
    
}

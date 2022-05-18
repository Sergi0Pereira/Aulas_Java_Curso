/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha_2;

/**
 *
 * @author sergio
 */
import java.util.Scanner;
public class Exercicio_106 {
    
    public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    
    double raio;
    
    System.out.println("Insira o raio da sua circunferencia: ");
    raio=in.nextDouble();
    
    double pi= 3.14159265359;
    double Diametro = raio*2;
    double perimetro= Diametro*pi;
    double area = pi*(raio*raio);
    

    System.out.println("O diametro da sua circunferencia é de: "+ Diametro);
    System.out.println("O perimetro da sua circunferencia é de: "+ perimetro);
    System.out.println("O area da sua circunferencia é de: "+ area);
    }
    
}

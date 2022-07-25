package Trabalho;

import java.util.Scanner;

public class NewClass extends Professor {

    public static void main(String[] args) {

        Professor Sergio = new Professor("Sergio Pereira", "Rua das cangostas",
                32, 917386182, "Professor Matematica", 1200, 100);

        Professor Antonio = new Professor("Antonio Esteves", "Rua da Porta",
                46, 917345582, "Professor Ciencias", 1000, 50);

        Aluno Joao = new Aluno(12, 916536985, "Joao Alves", "Rua da Esquerda", 10, "Desporto", "Biomecanica,Futebol,Fisiologia", "11,14,16");

        Continuo Junior = new Continuo("Junior Laercio", "Rua da Sacanagem", 30, 915696325, "Faxineiro", 700, "4 Ano", "Limpezas", 4);

        Sergio.displayP();
    }
}

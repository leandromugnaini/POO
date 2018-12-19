/* Exercício 2: Reconhecimento de uma palavra
Nome: Leandro Giusti Mugnaini 
Disciplina SSC0604 - Programação Orientada a Objetos
 */

package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String icmc = "ICMC-USP";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua frase: ");
        String frase = scanner.nextLine();

        if(frase.equals("ICMC-USP")) {
            System.out.println("reconhecido");
        }else{
            System.out.println("errado");
        }
    }
}

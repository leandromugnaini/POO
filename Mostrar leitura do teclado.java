/* Exercício 3: Mostrar leitura do teclado
Nome: Leandro Giusti Mugnaini 
Disciplina SSC0604 - Programação Orientada a Objetos
 */

package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua frase: ");
        String frase = scanner.nextLine();


        while(!frase.equals("fim")){
            System.out.println(frase);
            frase = scanner.next();
        }
    }
}

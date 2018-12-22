/*
Leandro Giusti Mugnaini 
Laboratório 2
Exercício 1: Análise de expressão aritmética
Programação orientada a objetos
*/

package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String ler = leitura.nextLine();
        char b;
        for (int i = 0; i < ler.length(); i++) {
            b = ler.charAt(i);

            if (b == '+')
                System.out.println('S');
            else if (b == '*')
                System.out.println('M');
        }
    }
}
/*
Leandro Giusti Mugnaini 
Laboratório 2
Exercício 2: Análise de expressão aritmética 2
Programação orientada a objetos
*/

package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);   //lê a sequência de caracteres digitada pelo usuário
        String ler = leitura.nextLine();    //converte a sequência de caracteres para char
        String b; //variável auxiliar
        String aux = null;

        for (int i = 0; i < ler.length(); i++) {    //estrutura de repetição que será utilizada para ler os caracteres
            b = ler.replace("+", " ").replace("*", " ");
            aux = b;
        }
        System.out.print(aux);
    }
}
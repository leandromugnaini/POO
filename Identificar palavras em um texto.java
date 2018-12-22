/*
Leandro Giusti Mugnaini 
Laboratório 2
Exercício 3: Identificar palavras em um texto
Programação orientada a objetos
*/


package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);   //lê a sequência de caracteres digitada pelo usuário
        String s = leitura.nextLine();    //converte a sequência de caracteres para char
        String[] array = s.split(" ");

        for (int i = 0; i < array.length; i++) {    //estrutura de repetição que será utilizada para ler os caracteres
            System.out.println(array[i]);
        }
    }
}

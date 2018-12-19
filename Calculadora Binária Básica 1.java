/* Exercício 4: Calculadora Binária Básica 1
Nome: Leandro Giusti Mugnaini 
Disciplina SSC0604 - Programação Orientada a Objetos
 */

package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalculadoraAritmeticaBinaria calculadora = new CalculadoraAritmeticaBinaria();
        Scanner leitura = new Scanner(System.in);
        int foo;
        String input;
        System.out.print("Entrada: ");

        while(true){
            input = leitura.nextLine();
            if(input.equals("=")){
                calculadora.imprimirSoma();
                break;
            }else{
                foo = Integer.parseInt(input);
                calculadora.Soma(foo);
                calculadora.imprimirSoma();
            }

        }
    }
}

/*
Leandro Giusti Mugnaini
Laboratório 3 - Exercício 3
Programação orientada a objetos
*/

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        int a, b, c;
        Scanner leitura = new Scanner(System.in);   //lê a sequência de caracteres digitada pelo usuário
        String s = leitura.nextLine();    //converte a sequência de caracteres para char
        String[] array = s.split(" ");

        a = Integer.parseInt(array[0]);
        b = Integer.parseInt(array[1]);

        if (array[2].equals("+")) {
            c = a + b;
            System.out.println(c);
        } else if (array[2].equals("*")) {
            c = a * b;
            System.out.println(c);
        }
    }
}

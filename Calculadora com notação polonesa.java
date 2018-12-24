/*
Leandro Giusti Mugnaini
Laboratório 3 - Exercício 1
Programação orientada a objetos
*/

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        int a, b, c;
        Scanner leitura = new Scanner(System.in);  
        String s = leitura.nextLine();    
        String[] array = s.split(" ");

        a = Integer.parseInt(array[1]);
        b = Integer.parseInt(array[2]);

        if (array[0].equals("+")) {
            c = a + b;
            System.out.println(c);
        } else if (array[0].equals("*")) {
            c = a * b;
            System.out.println(c);
        }
    }
}

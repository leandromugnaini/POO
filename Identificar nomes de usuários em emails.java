/*
Leandro Giusti Mugnaini
Laboratório 3 - Exercício 2
Programação orientada a objetos
*/

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String s = leitura.nextLine();
        String[] array = s.split(",");


        for(String item : array){
            int pos = (item.indexOf('@'));
            String b = item.substring(0, pos);
            System.out.println(b);
        }
    }
}

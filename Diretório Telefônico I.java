/**
 * Exercício 1: Diretório telefônico I - Classe Contato
 * @author Leandro Giusti Mugnaini
 * @version 1.0
 */

package com.company;

public class Contato {

    public String nome;
    public String telefone;


    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }


    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
	
    public static void main(String[] args) {
        ArrayList<Contato> arraylist = new ArrayList<Contato>();
        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String op;
        boolean stopLoop = true;

        String nome;
        String telefone;

        while (stopLoop) {
            System.out.println("Digite o numero de uma Opção:");
            System.out.println("Opção adicionar. Adicionar contatos");
            System.out.println("Opção buscar. Buscar contatos");
            System.out.println("Opção ncontatos. Reportar número de contatos");
            System.out.println("Opção todos. Mostrar todos");
            System.out.println("Opção fim. Finalizar aplicação");
            System.out.print("Opção:");
            op = sc.next();
            switch (op) {

                case "adicionar":
                    System.out.println("Digite Nome:");
                    nome = scan.next();
                    System.out.println("Digite Telefone:");
                    telefone = scan.next();
                    arraylist.add(new Contato(nome, telefone));
                    break;

                case "buscar":
                    System.out.println("Digite um Nome a ser buscado:");
                    nome = sc.next();
                    for (Contato contato : arraylist) {
                        if (contato.getNome().equals(nome)) {
                            System.out.println(contato.getTelefone());
                        }
                    }
                    break;

                case "ncontatos":
                    System.out.println(arraylist.size());
                    break;

                case "todos":
                    for (Contato contato : arraylist) {
                        System.out.println(contato.getNome());
                        System.out.println(contato.getTelefone());
                    }
                    break;

                case "fim":
                    stopLoop = false;
                    break;

                default:
                    System.out.println("Opção inválida!");

            }

        }

    }

}

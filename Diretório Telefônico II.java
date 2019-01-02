/**
 * Exercício 2: Diretório telefônico II - Classe Contato
 * @author Leandro Giusti Mugnaini - 10260351
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
            op = scan.next();
            switch (op) {
                case "adicionar":
                    System.out.println("Digite Nome:");
                    nome = scan.next();
                    System.out.println("Digite Telefone:");
                    telefone = scan.next();
                    if (arraylist.size() == 0) {
                        arraylist.add(new Contato(nome, telefone));
                    } else {
                        for (int i = 0; i < arraylist.size(); i++) {
                            Contato contato = arraylist.get(i);
                            if (!contato.getNome().equals(nome)) {
                                arraylist.add(new Contato(nome, telefone));
                                break;
                            } else {
                                System.out.println("ja_existe");
                            }
                            break;
                        }

                    }
                    break;

                case "buscar":
                    System.out.println("Digite um Nome a ser buscado:");
                    nome = scan.next();
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

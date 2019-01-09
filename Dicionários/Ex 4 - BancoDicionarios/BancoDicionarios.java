/*
* @author: Leandro Giusti Mugnaini
* @version: 1.0
* @releaseDate: 29/10/2018
*/

import java.util.ArrayList;

public class BancoDicionarios extends Dicionario{

    ArrayList<Dicionario> banco = new ArrayList<Dicionario>();

    private boolean adicionarDicionario(Dicionario dic) {
        if (banco.contains(dic)) {
            return false;
        } else {
            banco.add(dic);
            return true;
        }
    }

    private void mostrarConteudoDicionarios() {
        for (Dicionario aux : banco) {
            aux.mostrarTodo();
        }
    }

    /*public static void main(String args[]) {

        DicionarioSimples dicionario = new DicionarioSimples();
        DicionarioIP dic = new DicionarioIP();
        BancoDicionarios banco = new BancoDicionarios();
        dicionario.adicionar("casa1", "local onde se mora");
        dicionario.adicionar("casa2", "local se mora");
        dicionario.adicionar("casa3", "mora");
        dicionario.adicionar("casa4", "mora2");
        dicionario.adicionar("casa5", "mora3");
        //dicionario.adicionar("casa", "local onde se mora");
        //dicionario.buscar("casa");
        dic.adicionar("home3", "local onde se mora");
        dic.adicionar("home4", "local se mora");
        dic.adicionar("home5", "home onde se mora");
        dic.adicionar("home6", "home onde mora");
        banco.adicionarDicionario(dic);
        banco.adicionarDicionario(dicionario);
        banco.mostrarConteudoDicionarios();
    }*/

}
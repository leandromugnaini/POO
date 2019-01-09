/*
* @author: Leandro Giusti Mugnaini 
* @version: 1.0
* @releaseDate: 29/10/2018
*/

import java.util.HashMap;
import java.util.Map;

public class DicionarioSimples {

    private static Map<String, String> dicionario = new HashMap<String, String>();

    private boolean adicionar(String palavra, String significado) {
        if (dicionario.containsKey(palavra)) {
            System.out.println("deu ruim");
            return false;
        } else {
            dicionario.put(palavra, significado);
            //System.out.println("Valor da chave "+ palavra + " = "+dicionario.get(palavra));
            return true;
        }
    }

    private String buscar(String palavra) {
        if (dicionario.containsKey(palavra)) {
            String word = dicionario.get(palavra);
            System.out.println(word);
            return word;
        }else {
            return "";
        }
    }

    public void mostrarTodo(){
        for(String palavra : dicionario.keySet()){
            String word = dicionario.get(palavra);
            System.out.println(palavra + ":" + word);
        }
    }

    public static void main(String args[]) {
        DicionarioSimples dicionario = new DicionarioSimples();
        dicionario.adicionar("casa", "local onde se mora");
        dicionario.adicionar("home", "local se mora");
        dicionario.adicionar("casa", "local onde se mora");
        dicionario.buscar("casa");
        //dicionario.mostrarTodo();
    }
}

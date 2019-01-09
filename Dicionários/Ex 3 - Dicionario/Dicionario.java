/*
* @author: Leandro Giusti Mugnaini
* @version: 1.0
* @releaseDate: 29/10/2018
*/

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    protected static Map<String, String> dicionario = new HashMap<String, String>();

    protected boolean adicionar(String palavra, String significado) {
        if (dicionario.containsKey(palavra)) {
            System.out.println("deu ruim");
            return false;
        } else {
            dicionario.put(palavra, significado);
            //System.out.println("Valor da chave "+ palavra + " = "+dicionario.get(palavra));
            return true;
        }
    }

    protected String buscar(String palavra) {
        if (dicionario.containsKey(palavra)) {
            String word = dicionario.get(palavra);
            System.out.println(word);
            return word;
        }else {
            return "";
        }
    }

    protected void mostrarTodo(){
        for(String palavra : dicionario.keySet()){
            String word = dicionario.get(palavra);
            System.out.println(palavra + ":" + word);
        }
    }

}

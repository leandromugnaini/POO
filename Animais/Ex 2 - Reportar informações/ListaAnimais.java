/*
* @author: leandro Giusti Mugnaini
* @version: 1.0
* @releaseDate: 30/10/2018
*/

import java.util.ArrayList;

public class ListaAnimais{
    public void listar(ArrayList<Animal> lAnimais){
        for(Animal animal : lAnimais){
            animal.info();
            System.out.println();
        }
    }
}


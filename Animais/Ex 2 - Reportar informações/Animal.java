/*
* @author: leandro Giusti Mugnaini
* @version: 1.0
* @releaseDate: 30/10/2018
*/
import java.util.ArrayList;

public class Animal{
    protected String apelido;
    protected int idade;
    protected double peso;
    protected String descricao; 

    public void setApelido(String apelido){
        this.apelido = apelido;
    }

    public String getApelido(){
        return apelido;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getPeso(){
        return peso;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    public Animal(String apelido, int idade, double peso, String descricao){
        setApelido(apelido);
        setIdade(idade);
        setPeso(peso);
        setDescricao(descricao);
    }

    public void info(){
        System.out.println("Nome:"+getApelido());
        System.out.println("idade:"+getIdade());
        System.out.println("Peso:"+getPeso());
        System.out.println("Descrição:"+getDescricao());
    }

    /*public static void main(String args[]){
        Animal animal = new Animal("cachorro", 8, 10, "melhor amigo do homem");
        Guepardo guepardo = new Guepardo("ronaldo", 22, 77.2, "muito veloz", 27);
        Baleia baleia = new Baleia("flipper", 26, 800, "nada mt", 1.6, 6000);
        Aguia aguia = new Aguia("asas indomaveis", 40, 22, "voa mt", 10, 1300);

        animal.info();
        guepardo.info();
        baleia.info();
        aguia.info();
        ArrayList<Animal> listaAnimais = new ArrayList<>();
        listaAnimais.add(animal);
        listaAnimais.add(guepardo);
        listaAnimais.add(baleia);
        listaAnimais.add(aguia);

        ListaAnimais listaGeral = new ListaAnimais();
        listaGeral.listar(listaAnimais);

    }*/

}
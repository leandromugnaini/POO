/*
* @author: leandro Giusti Mugnaini
* @version: 1.0
* @releaseDate: 30/10/2018
*/

public class Aguia extends Animal{

    protected double elevacaoMaxima;

    public void setenvergadura(){
        this.envergadura = envergadura;
    }

    public double getenvergadura(){
        return envergadura;
    }

    public void setelevacaoMaxima(){
        this.elevacaoMaxima = elevacaoMaxima;
    }

    public double getelevacaoMaxima(){
        return elevacaoMaxima;
    }
    
    public Aguia(String apelido, int idade, double peso, String descricao, double envergadura, double elevacaoMaxima){
        super(apelido, idade, peso, descricao);
        this.envergadura = envergadura;
        this.elevacaoMaxima = elevacaoMaxima;
    }

    public void info(){
        System.out.println("Envergadura:"+getenvergadura());
        System.out.println("Elevacao:"+getelevacaoMaxima());
    }
}
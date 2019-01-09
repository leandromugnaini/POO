/*
* @author: leandro Giusti Mugnaini
* @version: 1.0
* @releaseDate: 30/10/2018
*/

public class Guepardo extends Animal{
    
    protected double veloc;

    public void setVeloc(){
        this.veloc = veloc;
    }

    public double getVeloc(){
        return veloc;
    }
    
    public Guepardo(String apelido, int idade, double peso, String descricao, double veloc){
        super(apelido, idade, peso, descricao);
        this.veloc = veloc;
    }

    public void info(){
        System.out.println("Velocidade:"+getVeloc());
    }


}
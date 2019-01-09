/*
* @author: leandro Giusti Mugnaini
* @version: 1.0
* @releaseDate: 30/10/2018
*/

public class Baleia extends Animal{

    protected double alturaMaximaSalto;
    protected double sinalInfrasonica;

    public void setalturaMaximaSalto(){
        this.alturaMaximaSalto = alturaMaximaSalto;
    }

    public double getalturaMaximaSalto(){
        return alturaMaximaSalto;
    }

    public void setsinalInfrasonica(){
        this.sinalInfrasonica = sinalInfrasonica;
    }

    public double getsinalInfrasonica(){
        return sinalInfrasonica;
    }
    
    public Baleia(String apelido, int idade, double peso, String descricao, double alturaMaximaSalto, double sinalInfrasonica){
        super(apelido, idade, peso, descricao);
        this.alturaMaximaSalto = alturaMaximaSalto;
        this.sinalInfrasonica = sinalInfrasonica;
    }

    public void info(){
        System.out.println("Salto:"+getalturaMaximaSalto());
        System.out.println("Sonido:"+getsinalInfrasonica());
    }
}
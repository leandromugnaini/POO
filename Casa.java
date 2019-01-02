/**
 * Exercício 3: Casa - Classe Casa
 * @author Leandro Giusti Mugnaini
 * @version 1.0
 */


public class Casa {

    public String cor;
    public int totalDePortas;
    public String porta;

    int nporta;
    boolean openclose;

    int aberta;
    int fechada;


    public void pinta(String cor){
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }


    public void adicionarporta(String porta, boolean openclose) {

        if(openclose == true){
            aberta++;
        }
        if(openclose == false){
            fechada++;
        }
        nporta = aberta + fechada;
        this.porta = porta;
        this.openclose = openclose;
    }

    public int quantasPortasEstaoAertas(){
        return aberta;
    }

    public int getNporta() {
        return nporta;
    }
	
    public static void main(String[] args) {
        Casa cs = new Casa();
        cs.pinta("azul");
        cs.adicionarporta("carvalho",true);

        cs.adicionarporta("cedro",false);

        cs.adicionarporta("cerejeira",false);

        cs.adicionarporta("eucalipto",true);


        System.out.println("Cor da casa é "+cs.getCor());
        System.out.println("A cada tem "+cs.quantasPortasEstaoAertas()+ " portas abertas ");
        System.out.println("A casa tem um total de "+cs.getNporta()+" portas");

    }	

}

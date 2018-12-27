/**
 * Leandro Giusti Mugnaini
 * Programação Orientada a Objetos
 * Laboratório 13/09
 */

class MundoYoshi
{
    private Yoshi yoshi1, yoshi2, yoshi3, yoshi4;

    /**
     * Constructor for objects of class MundoYoshi
     */
    public MundoYoshi()
    {
        yoshi1 = new Yoshi("amarelo",13,10);
        yoshi2 = new Yoshi("vermelho",0,1);
        yoshi3 = new Yoshi("azul",4,7);
        yoshi4 = new Yoshi("verde",0,0);


        yoshi1.setIsShowed(true);
        yoshi2.setIsShowed(true);
        yoshi3.setIsShowed(true);
        yoshi4.setIsShowed(true);
    }


    /**
     * Draw this MundoYoshi.
     */
    public void cenario()
    {
        yoshi1.irParaDireita(1);
        yoshi1.irParaCima(4);
        yoshi1.irParaEsquerda(10);
        yoshi2.irParaBaixo(5);
        yoshi2.irParaDireita(7);
        yoshi2.irParaEsquerda(3);
        yoshi2.irParaBaixo(3);
        yoshi2.irParaDireita(4);
        yoshi3.irParaEsquerda(3);
        yoshi3.irParaBaixo(5);
        yoshi3.irParaDireita(8);
        yoshi3.irParaCima(6);
        yoshi4.irParaDireita(10);
        yoshi4.irParaBaixo(14);
        yoshi4.irParaEsquerda(4);
        yoshi4.irParaCima(6);
        yoshi4.irParaDireita(4);



        System.out.println(yoshi1.getColor()+","+yoshi1.getPosicaoX()+","+yoshi1.getPosicaoY());
        System.out.println(yoshi2.getColor()+","+yoshi2.getPosicaoX()+","+yoshi2.getPosicaoY());
        System.out.println(yoshi3.getColor()+","+yoshi3.getPosicaoX()+","+yoshi3.getPosicaoY());
        System.out.println(yoshi4.getColor()+","+yoshi4.getPosicaoX()+","+yoshi4.getPosicaoY());
    }
}


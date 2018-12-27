/**
 * Leandro Giusti Mugnaini  
 * Programação Orientada a Objetos
 * Laboratório 13/09
 */

class MundoYoshi
{
    private YoshiMensageiro yoshi5;

    /**
     * Constructor for objects of class MundoYoshi
     */
    public MundoYoshi()
    {
        yoshi5 = new YoshiMensageiro("verde",0,0);
        yoshi5.setIsShowed(true);


    }


    /**
     * Draw this MundoYoshi.
     */
    public void cenario()
    {
        yoshi5.mensagem("mensagemA", 14, 9);
        //yoshi5.mensagem("mensagemB", 7, 11);

    }
}


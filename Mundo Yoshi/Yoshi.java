/**
 * Leandro Giusti Mugnaini 
 * Programação Orientada a Objetos
 * Laboratório 13/09
 */

class Yoshi {
    private int posicao_x;
    private int posicao_y;
    private String color;
    private String direcao;

    private Boolean isShowed;

    /**
     * Cria um objeto com posicao, color e direcao por default
     */
    public Yoshi() {
        posicao_x = 0;
        posicao_y = 0;
        color = "verde";
        direcao = "acima";
        isShowed = true;
    }

    public void setIsShowed(Boolean isShowed) {

        this.isShowed = isShowed;
    }

    public Yoshi(String color, int posicao_x, int posicao_y) {
        this.color = color;
        this.posicao_x = posicao_x;
        this.posicao_y = posicao_y;
    }


    /**
     * Captura o color
     */
    public String getColor() {
        return color;
    }

    /**
     * Modifica o color
     */
    public void setColor(String color) {

        this.color = color;
    }

    /**
     * Retorna posicao no eixo X
     */
    public int getPosicaoX() {

        return posicao_x;
    }

    /**
     * Retorna posicao no eixo Y
     */
    public int getPosicaoY() {

        return posicao_y;
    }


    /**
     * Mover para abaixo
     */
    public void irParaBaixo(int distancia) {
        this.posicao_y += distancia;
        visualizar();
    }

    /**
     * Mover para cima
     */
    public void irParaCima(int distancia) {
        this.posicao_y -= distancia;
        visualizar();
    }

    /**
     * Mover para esquerda
     */
    public void irParaEsquerda(int distancia) {
        this.posicao_x -= distancia;
        visualizar();
    }

    /**
     * Mover para direita
     */
    public void irParaDireita(int distancia) {
        this.posicao_x += distancia;
        visualizar();
    }


    /**
     * Visualiza objeto no Canvas
     */
    private void visualizar() {
        if (isShowed == true) {
            Canvas canvas = Canvas.getCanvas();
            canvas.drawImage(this, posicao_x, posicao_y);
            canvas.wait(250);
        }
    }
}

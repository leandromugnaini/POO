/**
 * Leandro Giusti Mugnaini  
 * Programação Orientada a Objetos
 * Laboratório 13/09
 *
 * Obs 1: na descrição do laboratório pede-se para comentar quais dificuldades eu tive para converter o código
 * do Yoshi para o Turtle. A dificuldade principal foi entender o que os novos métodos da classe Turtle faziam,
 * e como implementá-los corretamente sem alterar o resultado esperado.
 *
 * Obs 2: ao realizar o método forward, o objeto 'bob' anda uma quantidade de pixels determinada. Para tornar o
 * resultado mais visual, tomei a liberdade de multiplicar os valores originais por 10, para melhor visualização.
 */

class Main
{
    public static void main(String[] args) {
        MundoTurtle yoshi_mundo = new MundoTurtle();
        yoshi_mundo.cenario();
    }
}

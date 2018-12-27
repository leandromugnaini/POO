/**
 * Leandro Giusti Mugnaini 
 * Programação Orientada a Objetos
 * Laboratório 13/09
 */

class MundoTurtle
{
    private Turtle bob1, bob2, bob3, bob4;


    public MundoTurtle()
    {
        bob1 = new Turtle();
        bob1.penColor("yellow");
        bob1.speed(250);
        bob2 = new Turtle();
        bob2.penColor("red");
        bob2.speed(250);
        bob3 = new Turtle();
        bob3.penColor("blue");
        bob3.speed(250);
        bob4 = new Turtle();
        bob4.penColor("green");
        bob4.speed(250);

    }


    public void cenario()
    {
        bob1.forward(10);//direita
        bob1.left(90);//girou
        bob1.forward(40);//cima
        bob1.left(90);//girou
        bob1.forward(100);//esquerda
        bob2.left(270);//girou
        bob2.forward(50);//baixo
        bob2.left(90);//girou
        bob2.forward(70);//direita
        bob2.left(180);//girou
        bob2.forward(30);//esquerda
        bob2.left(90);//girou
        bob2.forward(30);//baixo
        bob2.left(90);//girou
        bob2.forward(40);//direita
        bob3.left(180);//girou
        bob3.forward(30);//esquerda
        bob3.left(90);//girou
        bob3.forward(50);//baixo
        bob3.left(90);//girou
        bob3.forward(80);//direita
        bob3.left(90);//girou
        bob3.forward(60);//cima
        bob4.forward(100);//direita
        bob4.left(270);//girou
        bob4.forward(140);//baixo
        bob4.left(270);//girou
        bob4.forward(40);//esquerda
        bob4.left(270);//girou
        bob4.forward(60);//cima
        bob4.left(270);//girou
        bob4.forward(40);//direita

    }
}


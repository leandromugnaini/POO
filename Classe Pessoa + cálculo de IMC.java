/*
Leandro Giusti Mugnaini
Laboratório 3 - Exercício 4
Programação orientada a objetos
*/

public class Person {
    private String name;
    private String nascimento;
    private double altura;
    private double peso;

    public Person(String nome, String nasc, double alt, double weigth){
        this.name = nome;
        nascimento = nasc;
        altura = alt;
        peso = weigth;
    }

    public Person(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNasc(String nasc){
        name = nasc;
    }

    public void setAlt(double alt){
        altura = alt;
    }

    public void setPeso(double weigth){
        peso = weigth;
    }

    public String getName(){
        return name;
    }

    public String getNasc(){
        return nascimento;
    }

    public double getAlt(){
        return altura;
    }

    public double getPeso(){
        return peso;
    }

    public double imc(){
        double imc = peso/(altura*altura);
        return imc;
    }

    public boolean equals(Person p){
        if(name.equals(p.getName())){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        String s = "Nome: "+ getName() + ", Data de nascimento: " + getNasc() + ", Altura: " + getAlt() + ", IMC: "+ imc();
        return s;
    }

    public static void main(String[] args) {

        Person p1 = new Person("Rafael", "23/01/1991", 1.72, 106.0);
        Person p2 = new Person("Maria", "13/02/1981", 1.82, 65.0);
        Person p3 = new Person("Mairo", "20/11/1890", 1.98, 132.0);

        System.out.println(p1 == p2);
        System.out.println(p2 == p3);


        System.out.println(p1.imc());
        System.out.println(p2.imc());
        System.out.println(p3.imc());

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }

}

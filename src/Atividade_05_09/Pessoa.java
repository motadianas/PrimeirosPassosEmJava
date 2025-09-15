package Atividade_05_09;
public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    //Metódo construtor
    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    //Métodos
    public void envelhecer(){
        if (idade<21){
            crescer(0.05);
        }
        this.idade++;
    }
    public void engordar(double peso){
        if(peso>0){
            this.peso+=peso;
        }
        else{
            System.out.println("Valor inválido");
        }
    }
    public void emagrecer(double peso){
        if(peso>0&&peso<this.peso){
            this.peso-=peso;
        }
        else{
            System.out.println("Valor inválido ou peso insuficiente");
        }
    }
    public void crescer(double altura){
        if(altura>0){
            this.altura+=altura;
        }
        else{
            System.out.println("Valor inválido");
        }
    }
    public void info(){
        System.out.println("Nome:"+this.nome);
        System.out.println("Idade:"+this.idade);
        System.out.println("Altura:"+this.altura);
        System.out.println("Peso:"+this.peso);
    }
}

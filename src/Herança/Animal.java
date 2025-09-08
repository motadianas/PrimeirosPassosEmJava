package Herança;

public class Animal {
    protected String nome;
    protected int idade;
    
    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        System.out.println("Construtor de Animal Chamado!");
    }
    
    public void dormir(){
        System.out.println(this.nome + " está dormindo...");
    }
    
    public void comer(){
        System.out.println(this.nome + " está comendo...");
    }
    
    public void info(){
        System.out.println("Nome: " + this.nome + ", Idade: " + this.idade);
    }
}

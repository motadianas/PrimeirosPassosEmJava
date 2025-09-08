package Herança;

public class Cachorro extends Animal {
    private String raca;
    
    public Cachorro(String nome, int idade, String raca){
        super(nome, idade);
        this.raca = raca;
        System.out.println("Construtor de Cachorro chamado!");
    }
    
    public void latir(){
        System.out.println(super.nome + " está latindo: Au au!");
    }
    
    public void infoCompleta(){
        super.info();
        System.out.println("Raça: " + this.raca);
    }
}

package Herança;

public class Cachorro2 extends Mamifero{
    protected String raca;

    public Cachorro2(String nome, String som, String tipoPelo, String raca) {
        super(nome, som, tipoPelo);
        this.raca = raca;
    }

    public void exibirDetalhes(){
        System.out.println("Nome : " + nome);
        System.out.println("Som : " + som);
        System.out.println("Tipo de Pelo : " + tipoPelo);
        System.out.println("Raca : " + raca);
    }
}

package Herança;

public class Mamifero extends Animal2{
    protected String tipoPelo;

    public Mamifero(String nome, String som, String tipoPelo) {
        super(nome, som);
        this.tipoPelo = tipoPelo;
    }
}

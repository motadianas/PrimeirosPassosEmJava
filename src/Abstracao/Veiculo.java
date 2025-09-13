package Abstracao;

abstract class Veiculo {
    protected int velocidade;

    public Veiculo (int velocidade){
        this.velocidade = velocidade;
    }
    public abstract void acelerar();
    public abstract void frear();
}

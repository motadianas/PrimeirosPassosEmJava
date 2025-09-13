package Abstracao;

abstract class Animal implements Alimentavel{
    public abstract void emitirSom();

    @Override
    public abstract void comer();

    public void dormir(){
        System.out.println("O animal esta dormindo");
    }
}

package Abstracao;

public class Cachorro extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("O cachorro faz: au au");
    }

    @Override
    public void comer(){
        System.out.println("O Cachorro esta comendo racao");
    }
}

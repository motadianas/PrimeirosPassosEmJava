package Abstracao;

public class Gato extends Animal {
    @Override
    public void emitirSom(){
        System.out.println("O Gato faz: miau");
    }

    @Override
    public void comer(){
        System.out.println("O gato esta comendo peixe");
    }
}
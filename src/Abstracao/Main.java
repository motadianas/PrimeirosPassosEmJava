package Abstracao;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println("**************Teste de animais**************");
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cachorro());
        animals.add(new Gato());
        //animals.add(new Animal()); Nao funciona, pois classe abstrata nao pode ser instanciada.
        System.out.println("--- Lista de Animais ---");
        for (Animal a : animals) {
            a.emitirSom();
            a.comer();
            a.dormir();
            System.out.println();
        }
        System.out.println();

        System.out.println("**************Teste de veiculos**************");
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro(10));
        veiculos.add(new Bicicleta(2));
        veiculos.add(new Moto(5));

        System.out.println("--- Lista de Veiculos ---");
        for (Veiculo v : veiculos) {
            v.acelerar(); // cada tipo reage de forma diferente
            v.frear();    // cada tipo reage de forma diferente
            System.out.println();
        }
        ((Carro)veiculos.get(0)).abastecer();
    }
}

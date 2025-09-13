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
            v.acelerar();
            v.frear();
            System.out.println();
        }
        ((Carro)veiculos.get(0)).abastecer();

        System.out.println("**************Teste de Contas Bancárias**************");
        List<ContaBancaria> contas = new ArrayList<>();
        contas.add(new ContaCorrente(1000));
        contas.add(new ContaPoupanca(1000));
        for (ContaBancaria c: contas){
            c.consultarSaldo();
            c.depositar(0); //Testando valor 0
            c.depositar(-10); //Testando valor negativo
            c.depositar(100);
            c.consultarSaldo();
            c.sacar(0); //Testando valor 0
            c.sacar(-10); //Testando valor negativo
            c.sacar(2000); //Testando valo maior que o saldo
            c.sacar(10);
            c.consultarSaldo();
            System.out.println();
        }

    }
}

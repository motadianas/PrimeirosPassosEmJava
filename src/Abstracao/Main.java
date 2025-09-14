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
        System.out.println("--- Lista de Contas ---");
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

        System.out.println("**************Teste de Funcionarios**************");
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("Diana",10000));
        funcionarios.add(new Vendedor("Maria", 1000));
        System.out.println("--- Lista de Funcionarios ---");
        for (Funcionario f : funcionarios){
            f.calcularSalario(200);
        }

        System.out.println("**************Teste de Notificacao**************");
        List<Notificacao> bip = new ArrayList<>();
        bip.add(new Email());
        bip.add(new SMS());
        bip.add(new PushNotification());
        String teste = "Parabésn! Você foi aprovada na nossa seleção de estágio.";
        System.out.println("--- Lista de Notificacao ---");
        for (Notificacao n : bip){
            n.enviar(teste);
            System.out.println();
        }
        System.out.println("**************Teste de Produtos**************");
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Livro("Percy Jackson",50));
        produtos.add(new Eletronico("Fone de Ouvido", 200));
        produtos.add(new Roupas("Casaco Bege", 123.20));
        System.out.println("--- Lista de Notificacao ---");
        for (Produto p : produtos){
            p.aplicarDesconto();
        }
    }
}

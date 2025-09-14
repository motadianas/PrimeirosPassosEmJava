package Abstracao;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println("************** Teste de animais **************");
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());
        //animals.add(new Animal()); Nao funciona, pois classe abstrata nao pode ser instanciada.
        System.out.println("--- Lista de Animais ---");
        for (Animal a : animais) {
            a.emitirSom();
            a.comer();
            a.dormir();
            System.out.println();
        }

        System.out.println("************** Teste de veiculos **************");
        //Teste de velocidade menor que 0 nos veículos
        List<Veiculo> veiculos0 = new ArrayList<>();
        veiculos0.add(new Carro(0));
        veiculos0.add(new Bicicleta(0));
        veiculos0.add(new Moto(0));
        // Teste de velocidade maior que 80 nos veículos
        List<Veiculo> veiculos80 = new ArrayList<>();
        veiculos80.add(new Carro(80));
        veiculos80.add(new Bicicleta(80));
        veiculos80.add(new Moto(80));
        System.out.println("--- Lista de Veiculos ---");
        System.out.println("--- Teste para veiculos iniciando em 0 --- ");
        for (Veiculo v : veiculos0) {
            v.frear();
            v.acelerar();
            if(v instanceof Motorizado){ //Serve para verificar se o objeto implementou aquela interface.
                // Caso tenha, volta positivo e executa a parte interna.
                Motorizado m = (Motorizado) v; // Cast -> transforma a referência do objeto de veiculo para motorizado
                m.abastecer(); // Permitindo que o metodo abastecer seja chamado
            }
            System.out.println();
        }
        System.out.println("--- Teste para veículos iniciando em 80 --- ");
        for (Veiculo v : veiculos80) {
           v.acelerar();
            v.frear();
            if(v instanceof Motorizado){ //Serve para verificar se o objeto implementou aquela interface.
                // Caso tenha, volta positivo e executa a parte interna.
                Motorizado m = (Motorizado) v; // Cast -> transforma a referência do objeto de veiculo para motorizado
                m.abastecer(); // Permitindo que o metodo abastecer seja chamado
            }
            System.out.println();
        }
        //((Carro)veiculos.get(0)).abastecer();
            // Cast -> serve para dizer ao compilador que aquele veículo é um carro.
            // O get, serve para pegar apenas o elemento de indice (0) da lista.

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

        System.out.println("************** Teste de Funcionarios **************");
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("Diana",10000));
        funcionarios.add(new Vendedor("Maria", 1000));
        System.out.println("--- Lista de Funcionarios ---");
        for (Funcionario f : funcionarios){
            f.calcularSalario(-10); //Testando valor negativo
            f.calcularSalario(0); //Testando valor 0
            f.calcularSalario(200);
        }

        System.out.println("************** Teste de Notificacao **************");
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

        System.out.println("************** Teste de Produtos **************");
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Livro("Percy Jackson",50));
        produtos.add(new Eletronico("Fone de Ouvido", 200));
        produtos.add(new Roupas("Casaco Bege", 123.20));
        System.out.println("--- Lista de Notificacao ---");
        for (Produto p : produtos){
            p.aplicarDesconto();
        }

        System.out.println("************** Teste de Transporte público avançado **************");
        List<Transporte> transportes = new ArrayList<>();
        transportes.add(new Onibus());
        transportes.add(new Metro());
        transportes.add(new BicicletaCompartilhada());
        System.out.println("--- Lista de Transportes ---");
        for(Transporte t : transportes){
            t.calcularTarifa();
            if(t instanceof MeioAmbiental){ //Serve para verificar se o objeto instancia MeioAmbiental
                MeioAmbiental m = (MeioAmbiental) t; //Cast seguro: transforma a referência t (que é um Transporte)
                // em uma referência de tipo MeioAmbiental.
                m.emissaoCO2(); //m do tipo MeioAmbiental, o compilador permite chamar m.emissaoCO2().
            }
            System.out.println();
        }

        System.out.println("************** Teste de Jogo de RPG completo **************");
        List<Personagem> personagens = new ArrayList<>();
        personagens.add(new Mago());
        personagens.add(new Arqueiro());
        personagens.add(new Guerreiro());
        System.out.println("--- Lista de Personagens ---");
        for (Personagem p : personagens){
            p.atacar();
            if(p instanceof Especial){
                Especial e = (Especial) p;
                e.usarHabilidade();
            }
            System.out.println();
        }
    }
}

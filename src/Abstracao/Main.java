package Abstracao;

public class Main {
    public static void main(String[] args){
        System.out.println("Teste de animal");
        Animal a1 = new Cachorro();
        Animal a2 = new Gato();
        //Animal a3 = new Animal(); Nao funciona, pois classe abstrata nao pode ser instanciada.
        a1.emitirSom();
        a1.comer();
        a1.dormir();
        a2.emitirSom();
        a2.comer();
        a2.dormir();
        System.out.println(" ");

        System.out.println("Teste de veiculos");
        Veiculo v1  = new Carro(10);
        Veiculo v2  = new Moto(5);
        Veiculo v3 = new Bicicleta(2);
        v1.acelerar();
        v1.frear();
        //Cast é uma sugestçao dada pelo GPT para fazer ele ver que o objeto veículo, na realidade foi instanciado como
        // carro e por isso tem o metodo abastecer. Para evitas ClassCastException
        ((Carro)v1).abastecer();
        //Cast seguro sugerido pelo gpt.
        if (v1 instanceof Carro) {
            Carro c = (Carro) v1; // cast seguro
            c.abastecer();
        } else {
            System.out.println("Esse veículo não é um carro!");
        }
        v2.acelerar();
        v2.frear();
        v3.acelerar();
        v3.frear();
        v3.frear();
        v3.frear();
        v3.frear();
    }
}

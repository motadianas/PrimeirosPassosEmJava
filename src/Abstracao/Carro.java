package Abstracao;

public class Carro extends Veiculo /*implements Motorizado*/{
    
    @Override
    public void acelerar(){
        super.velocidade+=10;
        System.out.println("O carro está acelerando + 10 Km/h");
    }
    @Override
    public void frear(){
        super.velocidade -=10;
        System.out.println("O Carro está freando -10 Km/h");
    }
//    @Override
//    public void abastecer(){
//        System.out.println("Carro abastecido");
//    }

}

package Atividade_05_09;

public class TesteCarro {
    public static void main(String[] args){
        Carro lfa = new Carro();
        lfa.info();
        lfa.setCombustivel(60);
        lfa.setConsumo(3.4);
        lfa.info();
        lfa.andar(116);
        lfa.info();
        lfa.abastecer(10);
        lfa.info();
        lfa.andar(116);
        lfa.info();

    }
}

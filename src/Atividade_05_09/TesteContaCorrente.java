package Atividade_05_09;

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("Roger", 12345);
        c1.info();
        c1.depositar(0);
        c1.depositar(-1);
        c1.depositar(1000);
        c1.info();
        c1.sacar(-1);
        c1.sacar(0);
        c1.sacar(1001);
        c1.sacar(10);
        c1.info();
    }

}

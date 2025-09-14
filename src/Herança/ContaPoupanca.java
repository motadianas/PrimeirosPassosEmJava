package Herança;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(int numeroConta, String titular) {
        super(numeroConta, titular);
    }
    public void calcularRendimento(double taxa){
        super.depositar(super.getSaldo()*taxa/100);
        System.out.println("Rendimentos depositados.");
    }
}

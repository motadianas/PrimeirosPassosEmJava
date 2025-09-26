package Abstracao;

public class ContaPoupanca extends ContaBancaria{
    private double jurosDeposito = 0.01;

    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        if(getSaldo()>=valor){
            setSaldo(getSaldo()-valor);
            System.out.println("Saque de R$ "+String.format("%.2f", valor)+
                " realizado na Conta Poupanca de "+getTitular());
        }
        else
            System.out.println("Saldo insuficiente.");
    }

    @Override
    public void depositar(double valor){
        double valorDeposito = getSaldo()+(valor+(valor*jurosDeposito));
        setSaldo(valorDeposito);
        System.out.println("Deposito de R$ "+String.format("%.2f", valor)+
                " realizado na Conta Poupanca de "+getTitular());
    }
    
}

package Abstracao;

public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial = 500.0;

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override //implementando os métodos abstratos
    public void depositar(double valor) {
        double saldo = getSaldo();
        setSaldo(saldo+valor);
        System.out.println("Deposito de R$ "+String.format("%.2f", valor)+
                " realizado na Conta corrente de "+getTitular());
    }
    
    @Override 
    public void sacar(double valor) {
        if(getSaldo()+limiteChequeEspecial>=valor){
            setSaldo(getSaldo()-valor);
            System.out.println("Saque de R$ "+String.format("%.2f", valor)+
                " realizado na Conta corrente de "+getTitular());
        }
        else
            System.out.println("Saldo insuficiente (mesmo com cheque especial).");
    }
    
}

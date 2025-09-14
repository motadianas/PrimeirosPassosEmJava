package Herança;

public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0;
    }

    public void sacar(double valor){
        if(valor>0){
            if(saldo>valor){
                this.saldo-=valor;
                System.out.println("Saque de R$"+valor+" realizado com sucesso.");
            }
            else {
                System.out.println("Saldo insuficiente para saque.");
            }
        }
        else{
            System.out.println("Valor de saque inválido.");
        }
    }
    public void depositar(double valor){
        if(valor>0){
            this.saldo+=valor;
            System.out.println("Deposito de R$"+valor+" realizado com sucesso.");
        }
        else{
            System.out.println("Valor de deposito inválido.");
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void exibirInfo(){
        System.out.println("Titular: " + titular);
        System.out.println("Numero da Conta: " + numeroConta);
        System.out.println("Saldo: R$" + saldo);
    }
}

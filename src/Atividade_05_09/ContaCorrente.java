package Atividade_05_09;

public class ContaCorrente {
    private int numeroDaConta;
    private String nomeDoTitular;
    protected double saldo;

    //Metodo Construtor

    public ContaCorrente(String nomeDoTitular, int numeroDaConta) {
        this.nomeDoTitular = nomeDoTitular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = 0.00;
    }
    //Métodos
    public void depositar(double valor){
        if(valor>0){
            this.saldo+=valor;
        } else {
            System.out.println("Valor Inválido");
        }
    }

    public void sacar(double valor){
        if (valor>0&&valor<=saldo){
            this.saldo-=valor;
        } else if (valor>0&&valor>saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            System.out.println("Valor inválido");
        }
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void info(){
        System.out.println("Nome do Titular: "+getNomeDoTitular());
        System.out.println("Numero da conta: "+getNumeroDaConta());
        System.out.println("Saldo da Conta: "+getSaldo());

    }


}

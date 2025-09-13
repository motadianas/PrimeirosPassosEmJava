package Abstracao;

abstract class ContaBancaria {
    protected float saldo;

    public ContaBancaria(float saldoInicial){
        this.saldo =saldoInicial;
    }
    abstract void sacar(float retirada);
    abstract void depositar(float deposito);
    protected void consultarSaldo(){
        System.out.println("Saldo atual: R$"+this.saldo);
    }

}

package Abstracao;

abstract class ContaBancaria {
    protected float saldo;

    protected ContaBancaria(float saldoInicial){ //BigDecimal garante precisao exata para valores monetarios.
        this.saldo =saldoInicial;
    }
    abstract void sacar(float retirada);
    abstract void depositar(float deposito);
    protected void consultarSaldo(){
        System.out.println("Saldo atual: R$"+this.saldo);
    }

}

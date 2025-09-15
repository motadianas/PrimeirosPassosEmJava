package Abstracao;

abstract class ContaBancaria {
    protected float saldo;

    protected ContaBancaria(float saldoInicial){ //BigDecimal garante precisao exata para valores monetarios.
        this.saldo =saldoInicial;
    }
    public abstract void sacar(float retirada);
    public abstract void depositar(float deposito);
    protected void consultarSaldo(){
        System.out.println("Saldo atual: R$"+this.saldo);
    }

}

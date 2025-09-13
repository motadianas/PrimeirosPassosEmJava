package Abstracao;

public class ContaCorrente extends ContaBancaria{
    public ContaCorrente(float saldoInicial) {
        super(saldoInicial);
    }

    @Override
    void sacar(float retirada) {
        if(retirada>0){
            if(saldo>0&&saldo>=retirada){
                saldo-=retirada;
                System.out.println("Valor retirado da Conta Corrente: R$"+retirada);
            }
            else{
                System.out.println("Saldo insuficiente na Conta Corrente para a retirada.");
            }
        }
        else {
            System.out.println("Valor de retirada inválido.");
        }
    }

    @Override
    void depositar(float deposito) {
        if (deposito > 0) {
            saldo += deposito;
            System.out.println("Valor depositado na Conta Corrente: R$" + deposito);
        } else {
            System.out.println("Valor de deposito inválido.");
        }
    }
}

package Abstracao;

public class ContaPoupanca extends ContaBancaria{
    protected ContaPoupanca(float saldoInicial){
        super(saldoInicial);
    }
    @Override
    void sacar(float retirada) {
        if(retirada>0){
            if(saldo>=retirada){
                saldo-=retirada;
                System.out.println("Valor retirado da Conta Poupança: R$"+retirada);
            }
            else{
                System.out.println("Saldo insuficiente na Conta Poupança para a retirada");
            }
        }
        else {
            System.out.println("Valor de retirada inválido.");
        }
    }

    @Override
    void depositar(float deposito) {
        if(deposito>0){
            saldo+=(deposito*1.1);
            System.out.println("Valor depositado na Conta Poupança: R$" + deposito);
        }
        else {
            System.out.println("Valor de deposito inválido.");
        }
    }
}

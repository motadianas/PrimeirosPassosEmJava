package Abstracao;

abstract class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public abstract void sacar(double valor); //Obriga a classe filha a implementar
    public abstract void depositar(double valor);
    public void exibirSaldo(){
        System.out.println(this.titular+ "- Saldo: R$"+String.format("%.2f", this.saldo));
    }
    
      
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    

}

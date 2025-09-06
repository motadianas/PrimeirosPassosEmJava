package Atividade_05_09;

public class ContaInvestimento extends ContaCorrente{
    private double taxaJuros;
    public ContaInvestimento(String nomeDoTitular, int numeroDaConta, double taxaJuros) {
        super(nomeDoTitular, numeroDaConta);
        this.taxaJuros = taxaJuros;
    }
    public void adicioneJuros(){
        super.saldo+=(this.taxaJuros*super.saldo/100);
    }



}

package Herança;

public class FuncionarioComissionado extends Funcionario2{
    private int vendas;
    private double percentualComissao;

    public FuncionarioComissionado(String nome, int cpf, float salarioBase, int vendas, double percentualComissao) {
        super(nome, cpf, salarioBase);
        this.vendas = vendas;
        this.percentualComissao = percentualComissao;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
}

package Herança;

public class FuncionarioHorista extends Funcionario2{
    private int horasTrabalhadas;
    private double valorHora;

    public FuncionarioHorista(String nome, int cpf, float salarioBase, int horasTrabalhadas, double valorHora) {
        super(nome, cpf, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}

package Abstracao;

abstract class Funcionario {
    protected String nome;
    protected float salarioBase;

    protected Funcionario(String nome, float salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract void calcularSalario(float bonus);

}

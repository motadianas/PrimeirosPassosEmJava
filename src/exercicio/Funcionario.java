package exercicio;
public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    //Métodos
    public String getNome(){
        return this.nome;
    }
    public double getSalario(){
        return this.salario;
    }
    public void aumentarSalario(double percentualDeAumento){
        this.salario += percentualDeAumento/100*this.salario;
    }
    
    
    
    
}

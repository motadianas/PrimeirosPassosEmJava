package Macacos;/*
1. Crie uma classe Funcionário
2. A classe deve possuir os atributos nome do tipo String e salario do tipo
double
3. Crio o construtor de maneira a inserir as informações necessárias da classe
4. A classe deve possuir os métodos getNome e getSalario e aumentarSalario
que recebe como parametro um percentualDeAumento
5. Faça o teste da classe
 */

public class Funcionario {
    //atributos
    private String nome;
    private double salario;

    //Método Construtor
    public Funcionario (String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    //Métodos
    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void aumentarSalario(double percentualDeAumento){
        this.salario+=percentualDeAumento/100*this.salario;
    }
}

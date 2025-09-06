package Macacos;

public class Alimento {
    //Atributos
    private String nome;
    private double kcal;

    //Metodo Construtor
    public Alimento(String nome, double kcal){
        this.nome = nome;
        this.kcal = kcal;
    }

    //Metodos
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getKcal() {
        return this.kcal;
    }
    public void setKcal(double kcal) {
        this.kcal = kcal;
    }
    @Override
    public String toString() {
        return nome + " (" + kcal + " kcal)";
    }
}

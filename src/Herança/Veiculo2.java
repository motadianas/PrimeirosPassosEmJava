package Herança;

import java.time.LocalDate;

public class Veiculo2 {
    private String placa;
    private int ano;
    private double preco;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if(placa!=null&&placa.length()==7){
            this.placa = placa;
        }
        else {
            System.out.println("A placa deve ter 7 caracteres");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano>=1900&&ano<=LocalDate.now().getYear()){
            this.ano = ano;
        }
        else {
            System.out.println("Ano invalido.");
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco>0){
            this.preco = preco;
        }
        else {
            System.out.println("Preco invalido.");
        }
    }

    public void exibirInfo(){
        System.out.println("placa = " + placa);
        System.out.println("ano = " + ano);
        System.out.println("preco = " + preco);
    }
}

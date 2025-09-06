package Atividade_05_09;

public class Carro {
    protected double combustivel;
    private double consumo;

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public void andar(double distancia){
        this.combustivel-=distancia/consumo;
    }

    public void abastecer(double quantidade){
        this.combustivel+=quantidade;
    }

    public void info(){
        System.out.println("Combustível "+getCombustivel());
        System.out.println("Consumo "+getConsumo());
    }

}

package Herança;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto (String marca, int ano, int cilindradas){
        super.setMarca(marca);
        super.setAno(ano);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    public void exibirInfoCompleta(){
        super.exibirInfo();
        System.out.println("Cilindradas: "+getCilindradas());
    }
}

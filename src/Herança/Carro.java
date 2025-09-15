package Herança;

public class Carro extends Veiculo2{
    private int numeroPortas;

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        if(numeroPortas>=2&&numeroPortas<=5){
            this.numeroPortas = numeroPortas;
        }
        else {
            System.out.println("Numero de portas invalido");
        }
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Numero de portas: " + numeroPortas);
    }
}

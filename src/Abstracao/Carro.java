package Abstracao;

public class Carro extends Veiculo implements Motorizado{
    public Carro (int velocidade){
        super(velocidade);
    }
    @Override
    public void acelerar(){
        if(velocidade<80){
            this.velocidade++;
            System.out.println("O carro acelerou. | Velocidade = "+this.velocidade);
        }else {
            System.out.println("A velocidade máxima do veículo é controlada. Ele só chega até 80km/h");
        }
    }
    @Override
    public void frear(){
        if(velocidade>0){
            this.velocidade--;
        System.out.println("O Carro freou. | Velocidade = "+this.velocidade);
        }
        else {
            System.out.println("A velocidade já está muito baixa. Não dá para diminuir.");
        }
    }
    @Override
    public void abastecer(){
        System.out.println("Carro abastecido");
    }

}

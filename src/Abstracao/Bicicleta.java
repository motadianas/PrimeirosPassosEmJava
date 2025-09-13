package Abstracao;

public class Bicicleta extends Veiculo {
    public Bicicleta(int velocidade) {
        super(velocidade);
    }

    @Override
    public void acelerar() {
        this.velocidade++;
        System.out.println("A bicicleta acelerou. | Velocidade = "+this.velocidade);
    }

    @Override
    public void frear() {
        if (velocidade > 0) {
            this.velocidade--;
            System.out.println("A bicicleta freou. | Velocidade = "+this.velocidade);
        } else {
            System.out.println("A velocidade já está muito baixa. Não dá para diminuir.");
        }
    }
}

package Abstracao;

public class Bicicleta extends Veiculo {
    
    @Override
    public void acelerar(){
        super.velocidade+=2;
        System.out.println("Voce esta pedalando");
    }
    @Override
    public void frear(){
        super.velocidade-=2;
        System.out.println("A bicicleta esta gastando havainas e diminuindo 2Km/h");
    }
}

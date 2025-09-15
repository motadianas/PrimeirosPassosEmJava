package Abstracao;

public class Arqueiro extends Personagem implements Especial{
    @Override
    public void usarHabilidade() {
        System.out.println("O Arqueiro usou a sua Habilidade especial: \"Flecha do destino\".");
    }

    @Override
    public void atacar() {
        System.out.println("O arqueiro atacou com uma flecha veloz e certeira.");
    }
}

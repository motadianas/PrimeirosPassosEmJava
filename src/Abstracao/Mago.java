package Abstracao;

public class Mago extends Personagem implements Especial{
    @Override
    public void usarHabilidade() {
        System.out.println("O mago usou a sua Habilidade especial: \"Luz das trevas\".");
    }

    @Override
    public void atacar() {
        System.out.println("O mago atacou com o seu cajado.");
    }
}

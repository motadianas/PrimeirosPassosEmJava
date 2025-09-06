package Atividade_05_09;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Roger",20,78.00,1.82);
        p1.info();
        p1.envelhecer();
        p1.info();
        p1.engordar(10);
        p1.info();
        p1.emagrecer(5);
        p1.info();
        p1.crescer(0.02);
        p1.info();

    }
}

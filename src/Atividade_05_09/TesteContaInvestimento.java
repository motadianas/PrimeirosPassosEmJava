package Atividade_05_09;

public class TesteContaInvestimento {
    public static void main(String[] args) {
        ContaInvestimento c1 = new ContaInvestimento("Roger", 12345,10);
        c1.info();
        c1.depositar(1000);
        c1.info();
        c1.adicioneJuros();
        c1.info();
        c1.adicioneJuros();
        c1.info();
        c1.adicioneJuros();
        c1.info();
        c1.adicioneJuros();
        c1.info();
        c1.adicioneJuros();
        c1.info();
    }
}

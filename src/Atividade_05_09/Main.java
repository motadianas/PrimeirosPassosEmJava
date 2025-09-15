package Atividade_05_09;

public class Main {
    public static void main(String[] args) {
        System.out.println("************** Teste de Pessoa **************");
        Pessoa p1 = new Pessoa("Roger",20,78.00,1.82);
        p1.info();
        p1.envelhecer();
        //p1.info();
        p1.engordar(-1);   //Teste negativo
        p1.engordar(0);    //Teste zero
        p1.engordar(10);
        //p1.info();
        p1.emagrecer(-1);   //Teste negativo
        p1.emagrecer(0);    //Teste zero
        p1.emagrecer(10);
        p1.emagrecer(78);   //Teste maior que peso
        p1.crescer(-1);    //Teste negativo
        p1.crescer(0);     //Teste zero
        p1.crescer(0.02);
        p1.info();
        System.out.println();

        System.out.println("************** Teste de Conta Corrente **************");
        ContaCorrente c1 = new ContaCorrente("Roger", 12345);
        c1.info();
        c1.depositar(0);  //Teste zero
        c1.depositar(-1); //Teste negativo
        c1.depositar(1000);
        c1.info();
        c1.sacar(-1); //Teste negativo
        c1.sacar(0); //Teste zero
        c1.sacar(1001);  //Teste maior
        c1.sacar(10);
        c1.info();
        System.out.println();

        System.out.println("************** Teste de Conta Investimento **************");
        ContaInvestimento c2 = new ContaInvestimento("Roger", 12345,10);
        c2.info();
        c2.depositar(1000);
        c2.info();
        c2.adicioneJuros();
        c2.info();
        c2.adicioneJuros();
        c2.info();
        c2.adicioneJuros();
        c2.info();
        c2.adicioneJuros();
        c2.info();
        c2.adicioneJuros();
        c2.info();
        System.out.println();

        System.out.println("************** Teste de Carro **************");
        Carro lfa = new Carro();
        lfa.info();
        lfa.setCombustivel(60);
        lfa.setConsumo(3.4);
        lfa.info();
        lfa.andar(116);
        lfa.info();
        lfa.abastecer(10);
        lfa.info();
        lfa.andar(116);
        lfa.info();
    }
}

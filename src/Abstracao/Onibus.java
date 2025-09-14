package Abstracao;

public class Onibus extends Transporte implements MeioAmbiental{
    @Override
    public void calcularTarifa() {
        System.out.println("A tarifa de onibus e de R%5,00");
    }

    @Override
    public void emissaoCO2() {
        System.out.println("A emissão de CO² do  Onibus e de 0,24Kg por passageiro.");
    }
}

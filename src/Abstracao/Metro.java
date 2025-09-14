package Abstracao;

public class Metro extends Transporte implements MeioAmbiental{
    @Override
    public void calcularTarifa() {
        System.out.println("A tarifa do metro e de R%6,33");
    }

    @Override
    public void emissaoCO2() {
        System.out.println("A emissão de CO² do  metro e de 0,05 Kg por passageiro.");
    }
}

package Herança;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("************** Teste de Animal **************");
        Cachorro dog = new Cachorro("Rex", 3, "Pastor Belga");
        dog.dormir();
        dog.comer();
        dog.latir();
        dog.infoCompleta();
        System.out.println();

        System.out.println("************** Teste de Veículo **************");
        Veiculo v = new Moto("Sandeiro", 2012, 1598);
        System.out.println("Marca: "+v.getMarca());
        System.out.println("Ano: "+v.getAno());
        System.out.println("Cilindradas: "+((Moto)v).getCilindradas());
        System.out.println();
        v.setMarca("Porsche");
        v.setAno(2025);
        ((Moto) v).setCilindradas(2995);
        System.out.println("\tVeículo após o teste de set:");
        ((Moto) v).exibirInfoCompleta(); //Teste do metodo Info completa
        System.out.println();

    }
    
}

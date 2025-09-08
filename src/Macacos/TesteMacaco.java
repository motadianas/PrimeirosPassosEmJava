package Macacos;

public class TesteMacaco {
    public static void main(String[] args) {

        //Teste de Macaco Com lista
        System.out.println("###Testando Macaco com estomago em lista: ###");
        //Criando e alimentando o Macaco Oliver
        Macaco oliver = new Macaco("Oliver");
        oliver.verEstomago();
        oliver.comerAlimento("Banana");
        oliver.verEstomago();
        oliver.digerirTotal();
        oliver.verEstomago();
        oliver.digerirTotal();
        oliver.digerirParcial();//Teste do metodo digerirParcial
        oliver.digerirParcial();
        oliver.comerAlimento("Maça");
        oliver.verEstomago();
        oliver.comerAlimento("Uva");
        oliver.verEstomago();
        System.out.println("Oliver digeriu a banana. Ele stá com fome. Vamos alimentá-lo?");
        oliver.comerAlimento("Coco");
        oliver.verEstomago();
        System.out.println("");


        //Criando e alimentando o Macaco Mauricio
        Macaco Mauricio = new Macaco("Mauricio");
        Mauricio.verEstomago();
        Mauricio.comerRefeicao("Chocolate","Café","Ovos");
        Mauricio.verEstomago();
        System.out.println("");

        //Teste Macaco Canibal
        Mauricio.comerAlimento(oliver.toString()); //toString() já sobrescrito
        Mauricio.verEstomago();
        System.out.println("Maurício estava com muita fome e comeu o Oliver e tuuuuudo que estava dentro do estomago dele.");
        System.out.println("Coitado de Oliver");
    }
}

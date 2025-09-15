package Macacos;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Teste de Macaco Com lista
        System.out.println("************** Testando Macaco com estomago em lista ************** ");
        System.out.println("----- Criando e alimentando o Macaco Oliver ----- ");
        Macaco Oliver = new Macaco("Oliver");
        Oliver.verEstomago();
        Oliver.comerAlimento("Banana");
        Oliver.verEstomago();
        Oliver.comerAlimento("Maça");
        Oliver.verEstomago();
        Oliver.comerAlimento("Uva");
        Oliver.verEstomago();
        Oliver.digerirParcial(); //Teste do metodo digerirParcial
        Oliver.verEstomago();
        System.out.println("Oliver digeriu a banana. Ele stá com fome. Vamos alimentá-lo?");
        Oliver.comerAlimento("Coco");
        Oliver.verEstomago();
        System.out.println();

        System.out.println("----- Criando e alimentando o Macaco Mauricio ----- ");
        Macaco Mauricio = new Macaco("Mauricio");
        Mauricio.verEstomago();
        Mauricio.comerAlimento("Chocolate");
        Mauricio.verEstomago();
        Mauricio.comerAlimento("Café");
        Mauricio.verEstomago();
        Mauricio.comerAlimento("Ovos");
        Mauricio.verEstomago();
        Mauricio.digerirTotal();    //Teste do digerirTotal()
        Mauricio.verEstomago();
        Mauricio.comerRefeicao("Milkshake", "Omelete", "Sorvete"); //Teste comerRefeicao()
        Mauricio.verEstomago();
        System.out.println();

        System.out.println("----- Teste Macaco Canibal ----- ");
        Mauricio.comerAlimento(Oliver.toString()); //toString() já sobrescrito
        Mauricio.verEstomago();
        System.out.println("Maurício estava com muita fome e comeu o Oliver e tuuuuudo que estava dentro do estomago dele.");
        System.out.println("Coitado de Oliver");
        System.out.println();

        //Teste do Monkey - Transformando o estomago em vetor/Array
        System.out.println("************** Testando Macaco com estomago em vetor/Array ************** ");
        System.out.println("----- Criando e alimento Olivia ----- ");
        Monkey Olivia = new Monkey("Olivia", 3);
        Olivia.verEstomago();
        Olivia.comer("Banana");
        Olivia.verEstomago();
        Olivia.comer("Maça");
        Olivia.verEstomago();
        Olivia.comer("Uva");
        Olivia.verEstomago();
        Olivia.digerir(); //Teste do metodo digerirParcial
        Olivia.verEstomago();
        System.out.println("Olivia digeriu a banana. Ela está com fome. Vamos alimentá-la?");
        Olivia.comer("Coco");
        Olivia.verEstomago();
        System.out.println();

        System.out.println("----- Criando e alimento Marcela ----- ");
        Monkey Marcela = new Monkey("Marcela", 4);
        Marcela.verEstomago();
        Marcela.comer("Chocolate");
        Marcela.verEstomago();
        Marcela.comer("Café");
        Marcela.verEstomago();
        Marcela.comer("Ovos");
        Marcela.verEstomago();

        System.out.println("----- Teste do macaco canibal ----- ");
        Marcela.comer(Olivia.toString());
        Marcela.verEstomago();
        System.out.println("Marcela estava com muita fome e comeu o Olivia e tuuuuudo que estava dentro do estomago dela.");
        System.out.println("Coitada de Olivia.");
        System.out.println();

//        //Teste de Mano - macaco com estomago como classe(alimento)
//        System.out.println("###Testando Macaco com estomago em Classe Alimento: ###");
//        //Criando e alimento Harry
//        Mono Harry = new Mono("Harry", 4);
//        Alimento banana = new Alimento("Banana", 100);
//        Alimento maca = new Alimento("Maca", 100);
//        Alimento uva = new Alimento("Uva", 100);
//        Alimento coco = new Alimento("Coco", 100);
//        System.out.println("Dentro do estomago de Harry tem: "+ Arrays.toString(Harry.verEstomago()));
//        Harry.comer(banana);
//        System.out.println("Dentro do estomago de Harry tem: "+ Arrays.toString(Harry.verEstomago()));
//        Harry.comer(maca);
//        System.out.println("Dentro do estomago de Harry tem: "+ Arrays.toString(Harry.verEstomago()));
//        Harry.comer(uva);
//        System.out.println("Dentro do estomago de Harry tem: "+ Arrays.toString(Harry.verEstomago()));
//        Harry.digerir(); //Teste do metodo digerirParcial
//        System.out.println("Dentro do estomago de Harry tem: "+ Arrays.toString(Harry.verEstomago()));
//        System.out.println("Harry digeriu a banana. Ele está com fome. Vamos alimentá-lo?");
//        Harry.comer(coco);
//        System.out.println("Dentro do estomago de Harry tem: "+ Arrays.toString(Harry.verEstomago()));
//        System.out.println();
//
//        //Criando e alimento Voldemort
//        Mono v = new Mono("Voldemort", 3);
//        Alimento jilo = new Alimento("Jilo", 100);
//        Alimento alcachofra = new Alimento("Alcachofra", 100);
//        Alimento gengibre = new Alimento("Gengibre", 100);
//        System.out.println("Dentro do estomago de Voldemort tem: "+ Arrays.toString(v.verEstomago()));
//        v.comer(jilo);
//        System.out.println("Dentro do estomago de Voldemort tem: "+ Arrays.toString(v.verEstomago()));
//        v.comer(alcachofra);
//        System.out.println("Dentro do estomago de Voldemort tem: "+ Arrays.toString(v.verEstomago()));
//        v.comer(gengibre);
//        System.out.println("Dentro do estomago de Voldemort tem: "+ Arrays.toString(v.verEstomago()));
//
//        //Teste do macaco canibal
//        Harry.comer(v);
//        System.out.println("Dentro do estomago de Harry tem: "+Arrays.toString(Harry.verEstomago()));
//        System.out.println("Harry estava com muita fome e comeu o Voldemort e tuuuuudo que estava dentro do estomago dele.");
//        System.out.println("Bem feito para Voldemort. Quem mandou ele ser mau");
//        System.out.println();

    }
}
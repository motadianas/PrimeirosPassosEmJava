package Macacos;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Teste de Macaco Com lista
        System.out.println("###Testando Macaco com estomago em lista: ###");
        //Criando e alimentando o Macaco Oliver
        Macaco Oliver = new Macaco("Oliver");
        System.out.println("Dentro do estomago de Oliver tem: "+Oliver.verEstomago());
        Oliver.comer("Banana");
        System.out.println("Dentro do estomago de Oliver tem: "+Oliver.verEstomago());
        Oliver.comer("Maça");
        System.out.println("Dentro do estomago de Oliver tem: "+Oliver.verEstomago());
        Oliver.comer("Uva");
        System.out.println("Dentro do estomago de Oliver tem: "+Oliver.verEstomago());
        Oliver.digerir(); //Teste do metodo digerir
        System.out.println("Dentro do estomago de Oliver tem: "+Oliver.verEstomago());
        System.out.println("Oliver digeriu a banana. Ele stá com fome. Vamos alimentá-lo?");
        Oliver.comer("Coco");
        System.out.println("Dentro do estomago de Oliver tem: "+Oliver.verEstomago());
        System.out.println("");

        //Criando e alimentando o Macaco Mauricio
        Macaco Mauricio = new Macaco("Mauricio");
        System.out.println("Dentro do estomago de Mauricio tem: "+Mauricio.verEstomago());
        Mauricio.comer("Chocolate");
        System.out.println("Dentro do estomago de Mauricio tem: "+Mauricio.verEstomago());
        Mauricio.comer("Café");
        System.out.println("Dentro do estomago de Mauricio tem: "+Mauricio.verEstomago());
        Mauricio.comer("Ovos");
        System.out.println("Dentro do estomago de Mauricio tem: "+Mauricio.verEstomago());
        //Teste Macaco Canibal
        Mauricio.comer(Oliver.toString()); //toString() já sobrescrito
        System.out.println("Dentro do estomago de Mauricio tem: "+Mauricio.verEstomago());
        System.out.println("Maurício estava com muita fome e comeu o Oliver e tuuuuudo que estava dentro do estomago dele.");
        System.out.println("Coitado de Oliver");
        System.out.println("");

        //Teste do Monkey - Transformando o estomago em vetor/Array
        System.out.println("###Testando Macaco com estomago em vetor/Array: ###");
        //Criando e alimento Olivia
        Monkey Olivia = new Monkey("Olivia", 3);
        System.out.println("Dentro do estomago de Olivia tem: "+ Arrays.toString(Olivia.verEstomago()));
        Olivia.comer("Banana");
        System.out.println("Dentro do estomago de Olivia tem: "+ Arrays.toString(Olivia.verEstomago()));
        Olivia.comer("Maça");
        System.out.println("Dentro do estomago de Olivia tem: "+ Arrays.toString(Olivia.verEstomago()));
        Olivia.comer("Uva");
        System.out.println("Dentro do estomago de Olivia tem: "+ Arrays.toString(Olivia.verEstomago()));
        Olivia.digerir(); //Teste do metodo digerir
        System.out.println("Dentro do estomago de Olivia tem: "+ Arrays.toString(Olivia.verEstomago()));
        System.out.println("Olivia digeriu a banana. Ela está com fome. Vamos alimentá-la?");
        Olivia.comer("Coco");
        System.out.println("Dentro do estomago de Olivia tem: "+ Arrays.toString(Olivia.verEstomago()));
        System.out.println("");

        // Criando e alimento Marcela
        Monkey Marcela = new Monkey("Marcela", 4);
        System.out.println("Dentro do estomago de Marcela tem: "+Arrays.toString(Marcela.verEstomago()));
        Marcela.comer("Chocolate");
        System.out.println("Dentro do estomago de Marcela tem: "+Arrays.toString(Marcela.verEstomago()));
        Marcela.comer("Café");
        System.out.println("Dentro do estomago de Marcela tem: "+Arrays.toString(Marcela.verEstomago()));
        Marcela.comer("Ovos");
        System.out.println("Dentro do estomago de Marcela tem: "+Arrays.toString(Marcela.verEstomago()));
        //Teste do macaco canibal
        Marcela.comer(Olivia.toString());
        System.out.println("Dentro do estomago de Marcela tem: "+Arrays.toString(Marcela.verEstomago()));
        System.out.println("Marcela estava com muita fome e comeu o Olivia e tuuuuudo que estava dentro do estomago dela.");
        System.out.println("Coitada de Olivia");
        System.out.println("");

        //Teste de Mano - macaco com estomago como classe(alimento)
        System.out.println("###Testando Macaco com estomago em Classe Alimento: ###");
        //Criando e alimento Harry
        Mono Harry = new Mono("Harry", 4);
        Alimento banana = new Alimento("Banana", 100);
        Alimento maca = new Alimento("Maca", 100);
        Alimento uva = new Alimento("Uva", 100);
        Alimento coco = new Alimento("Coco", 100);
        System.out.println("Dentro do estomago de Harry tem: "+ Arrays.toString(Harry.verEstomago()));
        Harry.comer(banana);
        System.out.println("Dentro do estomago de Harry tem: "+ Arrays.toString(Harry.verEstomago()));
        Harry.comer(maca);
        System.out.println("Dentro do estomago de Harry tem: "+ Arrays.toString(Harry.verEstomago()));
        Harry.comer(uva);
        System.out.println("Dentro do estomago de Harry tem: "+ Arrays.toString(Harry.verEstomago()));
        Harry.digerir(); //Teste do metodo digerir
        System.out.println("Dentro do estomago de Harry tem: "+ Arrays.toString(Harry.verEstomago()));
        System.out.println("Harry digeriu a banana. Ele está com fome. Vamos alimentá-lo?");
        Harry.comer(coco);
        System.out.println("Dentro do estomago de Harry tem: "+ Arrays.toString(Harry.verEstomago()));
        System.out.println("");

        //Criando e alimento Voldemort
        Mono v = new Mono("Voldemort", 3);
        Alimento jilo = new Alimento("Jilo", 100);
        Alimento alcachofra = new Alimento("Alcachofra", 100);
        Alimento gengibre = new Alimento("Gengibre", 100);
        System.out.println("Dentro do estomago de Voldemort tem: "+ Arrays.toString(v.verEstomago()));
        v.comer(jilo);
        System.out.println("Dentro do estomago de Voldemort tem: "+ Arrays.toString(v.verEstomago()));
        v.comer(alcachofra);
        System.out.println("Dentro do estomago de Voldemort tem: "+ Arrays.toString(v.verEstomago()));
        v.comer(gengibre);
        System.out.println("Dentro do estomago de Voldemort tem: "+ Arrays.toString(v.verEstomago()));

        //Teste do macaco canibal
        Harry.comer(v);
        System.out.println("Dentro do estomago de Harry tem: "+Arrays.toString(Harry.verEstomago()));
        System.out.println("Harry estava com muita fome e comeu o Voldemort e tuuuuudo que estava dentro do estomago dele.");
        System.out.println("Bem feito para Voldemort. Quem mandou ele ser mau");
        System.out.println("");

    }
}
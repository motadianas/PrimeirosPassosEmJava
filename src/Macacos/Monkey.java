package Macacos;

import java.util.Arrays;
//Estomago como array/vector
public class Monkey {
    //Atributos
    private String nome;
    private String[] estomago;

    //Construtor
    public Monkey(String nome, int tamanhoEstomago) {
        this.nome = nome;
        this.estomago = new String[tamanhoEstomago];
    }

    //Métodos
    public void comer(String alimento) { // Falta a verificação de estomago cheio
        boolean estomagoCheio = true;
        for (int i = 0; i < estomago.length; i++) {
            if (estomago[i] == null) {
                estomagoCheio = false;
                estomago[i] = alimento;
                break;
            }
        }
        if(estomagoCheio){
            System.out.println("O estomago já está cheio. Não e possivel comer.");
        }
    }
    public void verEstomago() { // Falta adicionar a verificação de estomago vazio
        int itemEstomago = 0;
        for (int i = 0; i < estomago.length; i++) {
            if (estomago[i] != null) {
                itemEstomago++;
            }
        }
        if(itemEstomago == 0){
            System.out.println("O estomago de "+this.nome+" esta vazio agora. Vamos alimentá-lo?");
        }
        else {
            String[] estomagoAgora = new String[itemEstomago];
            for (int i = 0; i < itemEstomago; i++) {
                estomagoAgora[i]= estomago[i];
            }
            System.out.println("Dentro do estomago de "+this.nome+" ha: "+Arrays.toString(estomagoAgora)+".");
        }
    }

    public void digerir(){ // Falta adicionar a verificação de estomago vazio
        int itemEstomago = 0;
        for (int i = 0; i < estomago.length; i++) {
            if (estomago[i] != null) {
                itemEstomago++;
            } else {
                break;
            }
        }
        if(itemEstomago==0){
            System.out.println("O estomago de "+this.nome+" esta vazio agora. Vamos alimentá-lo?");
        }
        else{
            for(int i=0; i<itemEstomago;i++){
                if(i<estomago.length-1) {
                    estomago[i] = estomago[i + 1];
                }else if(i==estomago.length-1){
                    estomago[i]=null;
                }
            }
        }
    }

    @Override
    public String toString() {
        int j = 0;
        for (int i = 0; i < estomago.length; i++) {
            if (estomago[i] != null) {
                j++;
            }
        }
        String[] estomagoAgora = new String[j];
        for (int i = 0; i < j; i++) {
            estomagoAgora[i]= estomago[i];
        }
        return "Macaco: "+nome+" e Estomago: "+Arrays.toString(estomagoAgora);
    }

}
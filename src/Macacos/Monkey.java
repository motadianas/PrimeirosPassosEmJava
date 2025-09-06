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
        for (int i = 0; i < estomago.length; i++) {
            if (estomago[i] == null) {
                estomago[i] = alimento;
                break;
            }
        }
    }
    public String[] verEstomago() { // Falta adicionar a verificação de estomago vazio
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
        return estomagoAgora;
    }
    public void digerir(){ // Falta adicionar a verificação de estomago vazio
        int j = 0;
        for (int i = 0; i < estomago.length; i++) {
            if (estomago[i] != null) {
                j++;
            } else {
                break;
            }
        }
        for(int i=0; i<j;i++){
            if(i<estomago.length-1) {
                estomago[i] = estomago[i + 1];
            }else if(i==estomago.length-1){
                estomago[i]=null;
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
package Macacos;

import java.util.Arrays;

//Estomago como Alimento (outra classe)
public class Mono extends Alimento {
    //Atributos
    private String nome;
    private Alimento[] estomago;

    //Construtor
    public Mono(String nome, int tamanhoEstomago) {
        super(nome, 2000); // valor kcal padrão só como exemplo
        this.nome = nome;
        this.estomago = new Alimento[tamanhoEstomago];
    }

    //Métodos
    public void comer(Alimento alimento) { // Falta a verificação de estomago cheio
        for (int i = 0; i < estomago.length; i++) {
            if (estomago[i] == null) {
                estomago[i] = alimento;
                break;
            }
        }
    }
    public Alimento[] verEstomago() { // Falta adicionar a verificação de estomago vazio
        int j = 0;
        for (int i = 0; i < estomago.length; i++) {
            if (estomago[i] != null) {
                j++;
            }
        }
        Alimento[] estomagoAgora = new Alimento[j];
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
        Alimento[] estomagoAgora = new Alimento[j];
        for (int i = 0; i < j; i++) {
            estomagoAgora[i]= estomago[i];
        }
        return super.toString()+ " e Estomago: "+ Arrays.toString(estomagoAgora);
    }

}


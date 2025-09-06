package PrimeirosExercicios;

public class Quadrado {
    private int lado;
    
    public int getLado(){
        return this.lado;
    }
    public void setLado(int lado){
        if(lado>0){
            this.lado = lado;
        }else{
            System.out.println("Valor inválido");
        }
    }
    public int calcularArea(){
        return this.lado*this.lado;
    }
    
    
}

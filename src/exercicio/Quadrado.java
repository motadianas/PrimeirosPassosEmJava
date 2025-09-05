package exercicio;

public class Quadrado {
    private int lado;
    
    public int getLado(){
        return this.lado;
    }
    public void setLado(int lado){
        this.lado = lado;
    }
    public int calcularArea(){
        return this.lado*this.lado;
    }
    
    
}

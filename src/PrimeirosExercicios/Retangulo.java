package PrimeirosExercicios;

public class Retangulo {
    private int base;
    private int altura;
    
    //m�todos
    public int getBase(){
    return this.base;
    }
    
    public int getAltura(){
    return this.altura;
    }
    
    public void setBase(int base){
        this.base = base;
    }
    
    public void setAltura(int altura){
        this.altura = altura;
    }
    
    public int calcularArea(){
        return this.base*this.altura;
    }
    
    public int calcularPerimetro(){
        return 2*this.altura+2*this.base;
    }
}

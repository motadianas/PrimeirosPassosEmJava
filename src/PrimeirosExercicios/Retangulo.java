package PrimeirosExercicios;

public class Retangulo {
    private int base;
    private int altura;
    
    //metodos
    public int getBase(){
    return this.base;
    }
    
    public int getAltura(){
    return this.altura;
    }
    
    public void setBase(int base){
        if(base>0){
            this.base = base;
        }else{
            System.out.println("Valor inválido");
        }
    }
    
    public void setAltura(int altura){
        if(altura>0){
            this.altura = altura;
        }else{
            System.out.println("Valor inválido");
        }
    }
    
    public int calcularArea(){
        return this.base*this.altura;
    }
    
    public int calcularPerimetro(){
        return 2*this.altura+2*this.base;
    }
}

package PrimeirosExercicios;

public class ControleTV {
    private int canal;
    private int volume=0;
    
    //metodos
    public int getCanal(){
        return this.canal;
    }
    public int getVolume(){
        return this.volume;
    }
    public void setCanal(int canal){
        if(canal>0){
            this.canal = canal;
        }
        else{
            System.out.println("Valor inválido");
        }
    }
    public void aumentarVolume(){
        if(this.volume<100){
            this.volume++;
        }
    }
    public void reduzirVolume(){
        if(this.volume>0){
            this.volume--;
        }
    }
}

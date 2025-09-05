package exercicio;

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
        this.canal = canal;
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

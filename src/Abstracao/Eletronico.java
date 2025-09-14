package Abstracao;

public class Eletronico extends Produto{
    public Eletronico (String nome, double preco){
        super(nome, preco);
    }
    @Override
    public void aplicarDesconto(){
        //15% de desconto em Eletronico
        System.out.println("O eletronico: "+this.nome+" de R$"+this.preco+" com desconto fica: R$"+(this.preco*.85));
    }
}
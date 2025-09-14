package Abstracao;

public class Roupas extends Produto{
    public Roupas (String nome, double preco){
        super(nome, preco);
    }
    @Override
    public void aplicarDesconto(){
        //20% de desconto em livros
        System.out.println("A roupa: "+this.nome+" de R$"+this.preco+" com desconto fica: R$"+(this.preco*.8));
    }
}
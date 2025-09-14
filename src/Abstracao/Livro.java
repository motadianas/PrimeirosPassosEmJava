package Abstracao;

public class Livro extends Produto{
    public Livro (String nome, double preco){
        super(nome, preco);
    }
    @Override
    public void aplicarDesconto(){
        //10% de desconto em livros
        System.out.println("O livro: "+this.nome+" de R$"+this.preco+" com desconto fica: R$"+(this.preco*0.9));
    }
}

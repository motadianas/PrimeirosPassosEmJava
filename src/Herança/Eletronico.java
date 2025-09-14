package Herança;

public class Eletronico extends Produto{
    private int garantia;
    private int voltagem;

    public Eletronico(String nome, double preco, String categoria, int garantia, int voltagem) {
        super(nome, preco, categoria);
        this.garantia = garantia;
        this.voltagem = voltagem;
    }

    public void exibirInfo(){
        System.out.println("Nome: "+getNome());
        System.out.println("Preço: R$"+getPreco());
        System.out.println("Categoria: "+getCategoria());
        System.out.println("Garantia: "+this.garantia);
        System.out.println("Voltagem: "+this.voltagem);
    }
}

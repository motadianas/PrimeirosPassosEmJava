package Abstracao;

public class Vendedor extends Funcionario{
    public Vendedor(String nome, float salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void calcularSalario(float comissao) {
        if(comissao>0){
            System.out.println("O salario do vendedor é de: R$ "+(salarioBase+comissao));
        }
        else {
            System.out.println("Valor Invalido");
        }
    }


}

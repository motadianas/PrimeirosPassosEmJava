package Abstracao;

public class Gerente extends Funcionario{
    public Gerente(String nome, float salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void calcularSalario(float bonus) {
        if(bonus>0){
            System.out.println("O salario do gerente é de: R$ "+(salarioBase+bonus));
        }
        else {
            System.out.println("Valor invalido");
        }
    }
}

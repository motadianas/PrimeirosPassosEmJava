package Herança;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("************** Teste de Animal **************");
        Cachorro dog = new Cachorro("Rex", 3, "Pastor Belga");
        dog.dormir();
        dog.comer();
        dog.latir();
        dog.infoCompleta();
        System.out.println();

        System.out.println("************** Teste de Veículo **************");
        Veiculo v = new Moto("Sandeiro", 2012, 1598);
        System.out.println("Marca: "+v.getMarca());
        System.out.println("Ano: "+v.getAno());
        System.out.println("Cilindradas: "+((Moto)v).getCilindradas());
        System.out.println();
        v.setMarca("Porsche");
        v.setAno(2025);
        ((Moto) v).setCilindradas(2995);
        System.out.println("\tVeículo após o teste de set:");
        ((Moto) v).exibirInfoCompleta(); //Teste do metodo Info completa
        System.out.println();

        System.out.println("************** Teste de Pessoa **************");
        Pessoa p = new Pessoa("Maria", 20);
        System.out.println("Nome: "+p.getNome());
        p.setNome("Diana");
        System.out.println("Idade: "+p.getIdade());
        System.out.println("Nome: "+p.getNome());
        p.setIdade(0);
        System.out.println("Idade: "+p.getIdade());
        p.setIdade(150);
        System.out.println("Idade: "+p.getIdade());
        p.setIdade(30);
        System.out.println("Idade: "+p.getIdade());

        System.out.println("************** Teste de Funcionario **************");
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Tom", 1000));
        funcionarios.add(new Gerente("Nikki Heat", 10000, "Departamento de homicidios"));
        System.out.println("--- Lista de Funcionarios ---");
        for (Funcionario f:funcionarios){
            System.out.println("Nome: "+f.getNome());
            System.out.println("Salario: R$"+f.getSalario());
            if(f instanceof Gerente){
                Gerente g = (Gerente) f;
                System.out.println("Departamento: "+g.getDepartamento());
            }
            System.out.println();
        }

        System.out.println("************** Teste de Animal/Mamifero/Cachorro **************");
        Cachorro2 c = new Cachorro2("Dog", "Au au", "Pelo curto branco", "Chihuahua");
        c.exibirDetalhes();
        System.out.println();

        System.out.println("************** Teste de Conta Bancaria **************");
        List<ContaBancaria> contas = new ArrayList<>();
        contas.add(new ContaBancaria(01, "Nikki"));
        contas.add(new ContaPoupanca(02, "Castle"));
        System.out.println("--- Lista de Contas ---");
        for (ContaBancaria conta :contas){
            conta.exibirInfo();
            conta.sacar(-1);         //Teste negativo
            conta.sacar(0);          //Teste zero
            conta.sacar(1);          //Teste maior q saldo
            conta.depositar(-1);     //Teste negativo
            conta.depositar(0);      //Teste zero
            conta.depositar(1000);   //Teste deposito correto
            conta.sacar(10);         //Teste deposito correto
            conta.exibirInfo();
            System.out.println();
        }

        System.out.println("************** Teste de Produto **************");
        Eletronico e = new Eletronico("Caixa de som",200,"Eletronico",12, 110);
        e.exibirInfo();
        System.out.println();

        System.out.println("************** Teste de Veículo2 **************");
        Carro car = new Carro();
        car.setPlaca("1");           //Teste placa menos digitos
        car.setPlaca("12345678");    //Teste placa digitos a mais
        car.setPlaca("1234567");
        car.setAno(1899);            //Teste Ano menor
        car.setAno(2026);            //Teste Ano maior
        car.setAno(2025);
        car.setPreco(-10);           //Teste Preco negativo
        car.setPreco(0);             //Teste Preco zero
        car.setPreco(1000);
        car.setNumeroPortas(1);      //Teste Portas menor
        car.setNumeroPortas(6);      //Teste Portas maior
        car.setNumeroPortas(3);
        car.exibirInfo();


        
    }

}

package exercicio;


public class Exercicio {

    public static void main(String[] args) {
        //Teste de bola
        Bola b  = new Bola();
        b.setCor("Azul");
        System.out.println("A cor da bola � " + b.getCor());
        b.setCor("Amarelo");
        System.out.println("A cor da bola � " + b.getCor());

        //Teste de Quadrado
        Quadrado q = new Quadrado();
        q.setLado(10);
        System.out.println("O lado do quadrado � " + q.getLado());
        System.out.println("A area do quadrado � " + q.calcularArea());
        System.out.println("A area do quadrado � usando a fun��o get " + q.getLado()*q.getLado());

        //Teste de Ret�ngulo
        Retangulo r = new Retangulo();
        r.setAltura(2);
        r.setBase(10);
        System.out.println("A altura do retangulo � " + r.getAltura());
        System.out.println("A base do retangulo � " + r.getBase());
        System.out.println("A area do retnagulo � " + r.calcularArea());
        System.out.println("O perimetro do retangulo � " + r.calcularPerimetro());

        //Controle Tv
        ControleTV c = new ControleTV();
        c.setCanal(11);
        System.out.println("O canal � " + c.getCanal());
        System.out.println("O volume � " + c.getVolume());
        c.reduzirVolume();
        System.out.println("O volume novo � " + c.getVolume());
        for(int i = 0; i<=200; i++){
            c.aumentarVolume();
        }
        System.out.println("O volume novo � "+c.getVolume());

        //Funcion�rio
        Funcionario diana = new Funcionario("Diana", 100000);
        System.out.println("Nome: "+diana.getNome());
        System.out.printf("Salario: R$%.2f\n",diana.getSalario());
        diana.aumentarSalario(10);
        System.out.printf("Salario novo: R$%.2f\n",diana.getSalario());
        
        //Macaco
        
    }
    
}

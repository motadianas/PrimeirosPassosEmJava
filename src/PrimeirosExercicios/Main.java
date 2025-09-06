package PrimeirosExercicios;

public class Main {

    public static void main(String[] args) {
        //Teste de bola
        Bola b  = new Bola();
        b.setCor("Azul");
        System.out.println("A cor da bola e " + b.getCor());
        b.setCor("Amarelo");
        System.out.println("A cor da bola e " + b.getCor());

        //Teste de Quadrado
        Quadrado q = new Quadrado();
        q.setLado(10);
        System.out.println("O lado do quadrado e " + q.getLado());
        System.out.println("A area do quadrado e " + q.calcularArea());
        System.out.println("A area do quadrado e usando a funcao get " + q.getLado()*q.getLado());

        //Teste de Retangulo
        Retangulo r = new Retangulo();
        r.setAltura(2);
        r.setBase(10);
        System.out.println("A altura do retangulo e " + r.getAltura());
        System.out.println("A base do retangulo e " + r.getBase());
        System.out.println("A area do retnagulo e " + r.calcularArea());
        System.out.println("O perimetro do retangulo e " + r.calcularPerimetro());

        //Controle Tv
        ControleTV c = new ControleTV();
        c.setCanal(11);
        System.out.println("O canal e " + c.getCanal());
        System.out.println("O volume e " + c.getVolume());
        c.reduzirVolume();
        System.out.println("O volume novo e " + c.getVolume());
        for(int i = 0; i<=200; i++){
            c.aumentarVolume();
        }
        System.out.println("O volume novo e "+c.getVolume());

        //Funcionario
        Funcionario diana = new Funcionario("Diana", 100000);
        System.out.println("Nome: "+diana.getNome());
        System.out.printf("Salario: R$%.2f\n",diana.getSalario());
        diana.aumentarSalario(10);
        System.out.printf("Salario novo: R$%.2f\n",diana.getSalario());
    }
}

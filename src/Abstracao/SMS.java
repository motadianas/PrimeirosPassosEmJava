package Abstracao;

public class SMS implements Notificacao {
    @Override
    public void enviar(String msg) {
        System.out.println("Você recebeu um novo SMS:");
        System.out.println(msg);
    }
}

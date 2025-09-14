package Abstracao;

public class Email implements Notificacao {
    @Override
    public void enviar(String msg) {
        System.out.println("Você recebeu um novo email:");
        System.out.println(msg);
    }
}

package Abstracao;

public class PushNotification implements Notificacao {
    @Override
    public void enviar(String msg) {
        System.out.println("Você recebeu um novo PushNotification:");
        System.out.println(msg);
    }
}

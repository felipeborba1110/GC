package spring.annotation.services.notification;


import spring.annotation.entities.Pedido;

//@Service
public class EmailNotificacaoService implements NotificacaoService {
    @Override
    public void notificar(Pedido pedido) {
        System.out.println("Notificando pedido via email...");
    }
}

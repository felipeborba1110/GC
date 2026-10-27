package spring.annotation.services.notification;

import org.springframework.stereotype.Service;
import spring.annotation.entities.Pedido;

@Service
public class SmsNotifications implements NotificacaoService {
    @Override
    public void notificar(Pedido pedido) {
        System.out.println("Notificando pedido via SMS...");
    }
}

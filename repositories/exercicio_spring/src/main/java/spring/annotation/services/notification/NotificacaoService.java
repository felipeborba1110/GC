package spring.annotation.services.notification;


import spring.annotation.entities.Pedido;

public interface NotificacaoService {
    void notificar(Pedido pedido);
}

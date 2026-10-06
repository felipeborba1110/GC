package spring.java_puro.services;


import spring.java_puro.entities.Pedido;

public class EmailNotificacaoService implements NotificacaoService {
    @Override
    public void notificar(Pedido pedido) {
        System.out.println("Notificando pedido via email...");
    }
}

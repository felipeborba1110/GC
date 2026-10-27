package spring.annotation.services;



import org.springframework.stereotype.Service;
import spring.annotation.entities.Pedido;
import spring.annotation.respositories.PedidoRepository;
import spring.annotation.services.notification.NotificacaoService;

import java.util.List;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;
    private final NotificacaoService notificacaoService;

    public PedidoService(PedidoRepository pedidoRepository, NotificacaoService notificacaoService) {
        this.pedidoRepository = pedidoRepository;
        this.notificacaoService = notificacaoService;
    }

    public void criarPedido(Pedido pedido) {
        pedidoRepository.salvar(pedido);
        notificacaoService.notificar(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepository.getPedidos();
    }
}

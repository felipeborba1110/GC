package spring.java_puro.services;



import spring.java_puro.entities.Pedido;
import spring.java_puro.respositories.PedidoRepository;

import java.util.List;

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

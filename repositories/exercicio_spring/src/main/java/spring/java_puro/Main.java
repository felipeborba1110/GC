package spring.java_puro;


import spring.java_puro.controller.PedidoController;
import spring.java_puro.respositories.PedidoRepository;
import spring.java_puro.services.EmailNotificacaoService;
import spring.java_puro.services.NotificacaoService;
import spring.java_puro.services.PedidoService;

public class Main {
    public static void main(String[] args) {
        PedidoRepository repository =
                new PedidoRepository();

        NotificacaoService notificacao =
                new EmailNotificacaoService();

        PedidoService pedidoService =
                new PedidoService(
                        repository,
                        notificacao
                );


        PedidoController pedidoController = new PedidoController(pedidoService);

        pedidoController.criarPedido(123, "Notebook","Informática",500);
        pedidoController.listarPedidos();
    }
}

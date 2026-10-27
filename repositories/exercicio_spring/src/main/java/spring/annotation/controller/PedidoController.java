package spring.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import spring.annotation.entities.Pedido;
import spring.annotation.entities.Produto;
import spring.annotation.services.PedidoService;

@Controller
public class PedidoController {

    private final DescontoController descontoController;
    private final PedidoService pedidoService;

    @Autowired
    public PedidoController(PedidoService pedidoService, DescontoController descontoController) {
        this.pedidoService = pedidoService;
        this.descontoController = descontoController;
    }

    public void criarPedido(int numPedido, String nome, String categoria,int preco){
        double novoPreco = descontoController.validarDesconto(categoria,preco);
        pedidoService.criarPedido(new Pedido(numPedido, new Produto(nome, categoria), novoPreco));
    }

    public void listarPedidos(){
        System.out.println(pedidoService.listarPedidos());
    }
}

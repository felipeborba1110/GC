package spring.java_puro.controller;


import spring.java_puro.entities.Pedido;
import spring.java_puro.entities.Produto;
import spring.java_puro.services.PedidoService;

public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    public void criarPedido(int numPedido, String nome, String categoria,int preco){
        pedidoService.criarPedido(new Pedido(numPedido, new Produto(nome, categoria), preco));
    }

    public void listarPedidos(){
        System.out.println(pedidoService.listarPedidos());
    }
}

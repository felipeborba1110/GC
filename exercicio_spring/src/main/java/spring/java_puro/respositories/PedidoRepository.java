package spring.java_puro.respositories;


import spring.java_puro.entities.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoRepository {

    private final List<Pedido> pedidos = new ArrayList<>();

    public void salvar(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> getPedidos() {
        return List.copyOf(pedidos);
    }
}

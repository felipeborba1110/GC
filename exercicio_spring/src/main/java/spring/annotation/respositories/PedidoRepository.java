package spring.annotation.respositories;


import org.springframework.stereotype.Repository;
import spring.annotation.entities.Pedido;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PedidoRepository {

    private final List<Pedido> pedidos = new ArrayList<>();

    public void salvar(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> getPedidos() {
        return List.copyOf(pedidos);
    }
}

package spring.annotation;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.annotation.controller.DescontoController;
import spring.annotation.controller.PedidoController;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(BeanConfig.class);
        DescontoController descontoController = context.getBean(DescontoController.class);
        PedidoController pedidoController = context.getBean(PedidoController.class);

        descontoController.salvarDesconto("Informática",0.5);

        pedidoController.criarPedido(123, "Notebook","Informática",500);
        pedidoController.criarPedido(1, "Manual do Mundo","Livro",100);

        pedidoController.listarPedidos();
    }
}

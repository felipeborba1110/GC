package repositories.springBallZ.ssj3;

public class Main {
    public static void main(String[] args) {
        BancoDeDados banco = new BancoDeDadosMySQL();
        ServicoEmail email = new ServicoEmailSMTP();

        ProcessadorDePedidos processador = new ProcessadorDePedidos(banco, email);

        Pedido pedido1 = new Pedido(new DescontoVIP());
        pedido1.setEmailCliente("ana@email.com");
        pedido1.addItem(100.0);
        processador.processar(pedido1);

        Pedido pedido2 = new PedidoDigital(new DescontoComum());
        pedido2.setEmailCliente("carlos@email.com");
        pedido2.addItem(50.0);
        processador.processar(pedido2);
    }
}

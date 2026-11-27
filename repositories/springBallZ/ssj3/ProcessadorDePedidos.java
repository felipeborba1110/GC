package repositories.springBallZ.ssj3;

class ProcessadorDePedidos {

    private BancoDeDados banco;
    private ServicoEmail email;

    public ProcessadorDePedidos(BancoDeDados banco, ServicoEmail email){
        this.banco = banco;
        this.email = email;
    }

    public void processar(Pedido pedido) {
        double valorTotal = pedido.calcularTotal();

        banco.salvar(pedido);

        email.enviarConfirmacao(pedido.getEmailCliente(), "Pedido confirmado no valor de R$ " + valorTotal);
    }
}










package spring.annotation.entities;

public class Pedido {
    private final long numeroPedido;
    private final Produto produto;
    private final double preco;

    public Pedido(long numeroPedido, Produto produto, double preco) {
        this.numeroPedido = numeroPedido;
        this.produto = produto;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Pedido:" +
                "\n-Numero do Pedido: " + numeroPedido +
                "\n-Produto: " + produto +
                "\n-Preco: R$" + preco + "\n";
    }
}

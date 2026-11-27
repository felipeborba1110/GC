package repositories.springBallZ.ssj3;

public class PedidoDigital extends Pedido {
    public PedidoDigital(Desconto desconto) {
        super(desconto);
    }
    @Override
    public double calcularTotal() {
        return getDesconto().aplicar(calcularItens());
    }

    @Override
    public double calcularFrete() {
        throw new UnsupportedOperationException("Produto digital não possui frete!");
    }
}

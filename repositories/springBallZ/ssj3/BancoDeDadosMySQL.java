package repositories.springBallZ.ssj3;

public class BancoDeDadosMySQL implements BancoDeDados{
    @Override
    public void salvar(Pedido p) {
        System.out.println("Salvando pedido no MySQL...");
    }
}

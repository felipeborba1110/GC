package repositories.springBallZ.ssj3;

public class DescontoVIP implements Desconto{
    @Override
    public double aplicar(double valor) {
        return valor * 0.80;
    }
}

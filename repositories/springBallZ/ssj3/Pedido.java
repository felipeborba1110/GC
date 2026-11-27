package repositories.springBallZ.ssj3;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Desconto desconto;
    private String emailCliente;
    private List<Double> itens = new ArrayList<>();

    public Pedido(Desconto desconto){
        this.desconto = desconto;
    }

    public double calcularTotal() {
        return desconto.aplicar(calcularItens() + calcularFrete());
    }

    public double calcularItens(){
        double soma = 0;
        for (Double preco : itens) {
            soma += preco;
        }
        return soma;
    }

    public double calcularFrete() {
        return 25.00;
    }

    public Desconto getDesconto() {
        return desconto;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public void addItem(Double item) {
        this.itens.add(item);
    }
}

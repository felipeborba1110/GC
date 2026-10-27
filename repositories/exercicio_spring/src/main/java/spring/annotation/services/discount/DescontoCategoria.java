package spring.annotation.services.discount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.annotation.respositories.DescontoRepository;

@Service
public class DescontoCategoria implements CalculadoraDesconto{

    private DescontoRepository descontoRepository;

    @Autowired
    public DescontoCategoria(DescontoRepository descontoRepository){
        this.descontoRepository = descontoRepository;
    }

    @Override
    public double calcular(String categoria, double valorProduto) {
        double desconto = descontoRepository.listarDesconto().getOrDefault(categoria,1.00);
        return valorProduto * desconto;
    }

    public void salvarDesconto(String categoria, double desconto){
        descontoRepository.adicionarDesconto(categoria,desconto);
    }
}

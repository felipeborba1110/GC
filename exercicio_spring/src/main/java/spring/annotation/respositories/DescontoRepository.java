package spring.annotation.respositories;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class DescontoRepository {
    private HashMap<String, Double> descontoPorCategoria = new HashMap<>();

    public void adicionarDesconto(String categoria, double desconto){
        descontoPorCategoria.put(categoria, desconto);
    }

    public HashMap<String, Double> listarDesconto(){
        return new HashMap<String,Double>(descontoPorCategoria);
    }
}

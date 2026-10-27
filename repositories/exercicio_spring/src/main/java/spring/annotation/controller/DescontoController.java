package spring.annotation.controller;

import org.springframework.stereotype.Controller;
import spring.annotation.services.discount.DescontoCategoria;

@Controller
public class DescontoController {
    private final DescontoCategoria descontoCategoria;

    public DescontoController(DescontoCategoria descontoCategoria){
        this.descontoCategoria = descontoCategoria;
    }

    public void salvarDesconto(String categoria, double desconto){
        descontoCategoria.salvarDesconto(categoria,desconto);
    }

    public double validarDesconto(String categoria, double preco){
        return descontoCategoria.calcular(categoria,preco);
    }

}

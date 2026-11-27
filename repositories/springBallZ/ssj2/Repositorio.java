package repositories.springBallZ.ssj2;

import java.util.ArrayList;
import java.util.List;

public class Repositorio implements RepositorioInterface{
    private List<PessoaInterface> pessoas = new ArrayList<>();
    private int index = 0;

    @Override
    public void guarda(PessoaInterface nova) {
        pessoas.add(nova);
    }

    @Override
    public PessoaInterface recupera(String cpf) {
        for(PessoaInterface p : pessoas){
            if (p.getCPF().equalsIgnoreCase(cpf)){
                return p;
            }
        }
        return null;
    }

    @Override
    public PessoaInterface primeiro() {
        this.index = 0;
        return pessoas.get(index);
    }

    @Override
    public PessoaInterface proximo() {
        this.index += 1;
        return pessoas.get(index);
    }

    @Override
    public void limpar() {
        pessoas.clear();
    }

    @Override
    public List<PessoaInterface> listar() {
        return List.copyOf(pessoas);
    }

    @Override
    public String toString() {
        return listar().toString();
    }
}

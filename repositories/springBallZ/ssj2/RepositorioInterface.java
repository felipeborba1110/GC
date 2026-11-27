package repositories.springBallZ.ssj2;

import java.util.List;

public interface RepositorioInterface {
    void guarda(PessoaInterface nova);
    PessoaInterface recupera(String cpf);
    PessoaInterface primeiro();
    PessoaInterface proximo();
    void limpar();
    List<PessoaInterface> listar();
}

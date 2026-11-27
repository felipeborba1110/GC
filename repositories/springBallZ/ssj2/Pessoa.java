package repositories.springBallZ.ssj2;

public class Pessoa implements PessoaInterface{
    private String CPF;
    private String nome;
    private int numeroCadeira;
    private char tipo;

    public Pessoa(String CPF, String nome, int numeroCadeira){
        this.CPF = CPF;
        this.nome = nome;
        this.numeroCadeira = numeroCadeira;
        this.tipo = gerarTipo(numeroCadeira);
    }

    private char gerarTipo(int numeroCadeira){
        if (numeroCadeira % 2 == 0){
            return 'N';
        }
        return 'F';
    }

    @Override
    public String getCPF() {
        return this.CPF;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return String.format("""
                CPF: %s
                Nome: %s
                Cadeira: %d
                Tipo: %s""",CPF,nome,numeroCadeira,tipo);
    }
}

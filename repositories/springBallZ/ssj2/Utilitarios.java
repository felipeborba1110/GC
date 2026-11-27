package repositories.springBallZ.ssj2;

public class Utilitarios {
    public static void duplica(RepositorioInterface repoA, RepositorioInterface repoB){
        repoB.limpar();
        for(PessoaInterface p : repoA.listar()){
            repoB.guarda(p);
        }
    }

    public static void diferenca(RepositorioInterface repoA, RepositorioInterface repoB, RepositorioInterface repoC){
        for(PessoaInterface p : repoA.listar()){
            if (repoB.recupera(p.getCPF()) == null){
                repoC.guarda(p);
            }
        }
    }
}

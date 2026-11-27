package repositories.springBallZ.ssj2;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("012","Jorge",4);
        Pessoa p2 = new Pessoa("123", "Roberto", 3);
        Pessoa p3 = new Pessoa("234","Amanda",5);

        Repositorio repoA = new Repositorio();
        repoA.guarda(p1);
        repoA.guarda(p2);

        Repositorio repoB = new Repositorio();
        Utilitarios.duplica(repoA, repoB);

        Repositorio repoC = new Repositorio();
        repoA.guarda(p3);
        Utilitarios.diferenca(repoA,repoB,repoC);

        System.out.println(repoC);

    }
}

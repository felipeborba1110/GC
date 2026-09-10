package stardewManager;

public class Galinha implements Animal{
    private int id;
    private String name;
    private String race;
    private int age;
    private String status;
    private final String som = "Có-Có";

    public Galinha(int id, String name, String race, int age, String status) {
        this.id = id;
        this.name = name;
        this.race = race;
        this.age = age;
        this.status = status;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String emitirSom() {
        return som;
    }

    @Override
    public void coletarProduto() {
        Produtos.adicionarProduto("Ovo");
        System.out.println("Pegando no Ovo...");
    }

    @Override
    public String toString() {
        return String.format("""
                [ID: %2d] %s (Galinha)
                 - Raça: %s
                 - Idade: %d %s
                 - Status: %s
                 - Som: %s
                """,id,name,race,age,age==1 ? "ano":"anos",status,som);
    }
}

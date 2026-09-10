package stardewManager;

public class Vaca implements Animal{
    private int id;
    private String name;
    private String race;
    private int age;
    private String status;

    @Override
    public String emitirSom() {
        return "Moooo";
    }

    @Override
    public String coletarProduto() {
        return "Pegando Leite...";
    }
}

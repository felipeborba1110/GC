package stardewManager;

public class Galinha implements Animal{
    private int id;
    private String name;
    private String race;
    private int age;
    private String status;

    @Override
    public String emitirSom() {
        return "Có-Có";
    }

    @Override
    public String coletarProduto() {
        return "Pegando ovos...";
    }
}

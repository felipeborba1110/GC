package stardewManager;

public class Main {
    public static void main(String[] args) {
        Menus app = new Menus();

        Animal v1 = new VacaMae(0, "Mimosa","Malhada",2,"Pronta para dar leite");
        Curral.adicionarAnimal(v1);

        app.menuPrincipal();
    }
}

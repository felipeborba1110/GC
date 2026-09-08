package newSteveCode;

public class Main {
    public static void main(String[] args) {
        InicializeMaterial m = new InicializeMaterial();

        Pickaxe p1 = new Pickaxe(m.madeira);

        System.out.println(p1);

        p1.mine(60);
        p1.repair(40);
        p1.mine(10);
        p1.repair(20);
    }
}

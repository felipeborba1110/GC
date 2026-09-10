package stardewManager;

public class Pintinho extends Galinha{
    private GalinhaMae mae;

    public Pintinho(int id, String name, String race, String status, GalinhaMae mae) {
        super(id, name, race, 0, status);
        this.mae = mae;
    }

    public Pintinho(int id, String name, String race, String status) {
        super(id, name, race, 0, status);
    }

    public void setMae(GalinhaMae mae) {
        this.mae = mae;
    }
}

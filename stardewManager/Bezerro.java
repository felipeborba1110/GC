package stardewManager;

public class Bezerro extends Vaca{
    private VacaMae mae;

    public Bezerro(int id, String name, String race, String status, VacaMae mae) {
        super(id, name, race, 0, status);
        this.mae = mae;
    }

    public Bezerro(int id, String name, String race, String status) {
        super(id, name, race, 0, status);
    }

    public void setMae(VacaMae mae){
        this.mae = mae;
    }
}

package stardewManager;

import java.util.ArrayList;
import java.util.List;

public class GalinhaMae extends Galinha{
    private List<Pintinho> filhos = new ArrayList<>();

    public void procriar(Pintinho filho){
        filhos.add(filho);
    }

    public GalinhaMae(int id, String name, String race, int age, String status, List<Pintinho> filhos) {
        super(id, name, race, age, status);
        this.filhos = filhos;
    }

    public GalinhaMae(int id, String name, String race, int age, String status) {
        super(id, name, race, age, status);
    }
}
